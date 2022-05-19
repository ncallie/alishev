package ru.ncallie.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.ncallie.models.Person;


import java.util.List;


@Component
public class PersonDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Person> index() {
        return jdbcTemplate.query("SELECT * FROM Person", new PersonMapper());
    }

    public Person show(String email) {
        try {
            return jdbcTemplate.queryForObject("SELECT * FROM Person WHERE email=?"
                    , new BeanPropertyRowMapper<>(Person.class), email);
        } catch (DataAccessException e) {
            return null;
        }

    }

    public Person show(int id) {
       return jdbcTemplate.queryForObject("SELECT * FROM Person WHERE id=?",
               new BeanPropertyRowMapper<>(Person.class), id);
    }

    public void save(Person person) {
        jdbcTemplate.update("INSERT INTO Person(name, age, email, address) VALUES(?, ?, ?, ?)",
                person.getName(), person.getAge(), person.getEmail(), person.getAddress());
    }

    public void update(int id, Person person) {
        jdbcTemplate.update("UPDATE Person SET name=?, age=?, email=?, address=? WHERE id=?",
                person.getName(), person.getAge(), person.getEmail(), person.getAddress(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM Person WHERE id=?", id);
    }
}
