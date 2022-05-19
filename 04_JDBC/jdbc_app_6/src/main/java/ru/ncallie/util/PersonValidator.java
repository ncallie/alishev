package ru.ncallie.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.ncallie.dao.PersonDAO;
import ru.ncallie.models.Person;

@Component
public class PersonValidator implements Validator {
    private final PersonDAO personDAO;

    @Autowired
    public PersonValidator(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Person person = (Person) target;
        Person show = personDAO.show(person.getEmail());
        if (show == null)
            ;
        else if (person.getEmail().equals(show.getEmail()) && person.getId() == show.getId())
            ;
        else
            errors.rejectValue("email", "", "This email is already taken");
    }
}
