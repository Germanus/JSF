package my.ilya.jsf.dao;

import java.util.List;

import my.ilya.jsf.core.Person;

public interface PersonDao {

    List<Person> findAll();

    List<Person> findByLastname(String lastname);

    void save(Person person);

    Person find(Long id);
}
