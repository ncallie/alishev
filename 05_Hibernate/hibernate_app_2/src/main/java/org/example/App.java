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
        createPersonAndItem(session); 

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

    private static void createPersonAndItem(Session session) {
        try {
            session.beginTransaction();

            Person person = new Person("HiberPerson", 99);
            Item item = new Item("HiberPersonItem", person);
            person.setItems(new ArrayList<Item>(Collections.singletonList(item)));

            session.persist(person);
            session.persist(item);

            session.getTransaction().commit();
        }finally {
            sessionFactory.close();
        }
    }
}
