package org.example;


import org.example.model.Item;
import org.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    private static Configuration configuration = new Configuration()
            .addAnnotatedClass(Person.class).addAnnotatedClass(Item.class);
    private static SessionFactory sessionFactory = configuration.buildSessionFactory();
    public static void main( String[] args ) {
        Session session = sessionFactory.getCurrentSession();
        createPersonAndItemCascade(session);

    }
    private static void getPersonItem(Session session, Object o) {
        try {
            session.beginTransaction();
            Person person = session.get(Person.class, o);
            System.out.println(person);
            List<Item> items = person.getItems();
            for(Item item :items) {
                System.out.println(item.getItem_name());
            }
            session.getTransaction().commit();
        }finally {
            sessionFactory.close();
        }
    }
    private static void getOwnerItem(Session session, Object o) {
        try {
            session.beginTransaction();
            Item item = session.get(Item.class, o);
            System.out.println(item);
            Person owner = item.getOwner();
            System.out.println(owner);
            session.getTransaction().commit();
        }finally {
            sessionFactory.close();
        }
    }

    private static void addItemPerson(Session session, Object o) {
        try {
            session.beginTransaction();

            Person person = session.get(Person.class, o);
            Item newItem = new Item("ItemHibernate", person);
            person.getItems().add(newItem);//желательно добавить

            session.persist(newItem);
            session.getTransaction().commit();
        }finally {
            sessionFactory.close();
        }
    }

    private static void createPersonAndItemCascade(Session session) {
        try {
            session.beginTransaction();

            Person person = new Person("HiberPerson4", 93);

            person.addItem(new Item("HiberPersonItem4", person));

            session.persist(person);
            System.out.println(person.getId());
            session.getTransaction().commit();
        }finally {
            sessionFactory.close();
        }
    }
}
