package ru.ncallie.dao;

import org.springframework.stereotype.Component;
import ru.ncallie.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "Tom", 18, "tom@mail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Bob", 21, "bob@mail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Mike", 42, "mke@mail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Katy", 14, "katy@mail.com"));
    }
    public List<Person> index() {
        return people;
    }
    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person person) {
        Person personToBeUpdate = show(id);
        personToBeUpdate.setName(person.getName());
        personToBeUpdate.setAge(person.getAge());
        personToBeUpdate.setEmail(person.getEmail());
    }

    public void delete(int id) {
        people.removeIf(person -> person.getId() == id);
    }
}
