package com.harmew.person.core.gateways;

import com.harmew.person.core.entities.Person;

import java.util.List;

public interface PersonGateway {
    Person createPerson(Person person);

    Person findByCpfCnpj(String cpfCnpj);

    List<Person> obtainAllPersons();
}
