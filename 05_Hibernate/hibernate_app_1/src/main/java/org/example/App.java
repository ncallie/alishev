package org.example;


import org.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class App {
    private static Configuration configuration = new Configuration().addAnnotatedClass(Person.class);
    private static SessionFactory sessionFactory = configuration.buildSessionFactory();
    public static void main( String[] args ) {
        Session session = sessionFactory.getCurrentSession();
        getAllPerson(session);
    }

    private static void savePerson(Session session, Person person) {
        try {
            session.beginTransaction();
            session.persist(person);
            session.getTransaction().commit();

            System.out.println(person.getId());
        } finally {
            sessionFactory.close();
        }
    }
    private static Person getPerson(Session session, Object o) {
        try {
            session.beginTransaction();
            Person person = session.get(Person.class, o);
            System.out.println(person.getName());
            session.getTransaction().commit();
            return person;
        } finally {
            sessionFactory.close();
        }
    }

    private static void updatePerson(Session session, Object o) {
        try {
            session.beginTransaction();
            Person person = session.get(Person.class, o);
            person.setName("Update");
            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }
    }
    private static void deletePerson(Session session, Object o) {
        try {
            session.beginTransaction();
            Person person = session.get(Person.class, o);
            session.remove(person);
            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }
    }

    private static void getAllPerson(Session session) {
        try {
            session.beginTransaction();
//            List<Person> from_person = session.createQuery("FROM Person WHERE name LIKE 'T%'", Person.class).getResultList();
//            for (Person person : from_person) {
//                System.out.println(person.getName());
//            }
//            session.createNativeQuery("update Person set name='Young' where age < 30", Person.class).executeUpdate();
            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }
    }
}
