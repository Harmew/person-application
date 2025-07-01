package com.harmew.person.infrastructure.mappers;

import com.harmew.person.core.entities.Person;
import com.harmew.person.infrastructure.persistence.PersonEntity;
import org.springframework.stereotype.Component;

@Component
public class PersonEntityMapper {

    public PersonEntity toEntity(Person person) {
        return new PersonEntity(
                person.id(),
                person.name(),
                person.email(),
                person.cpfCnpj(),
                person.type()
        );
    }

    public Person toDomain(PersonEntity person) {
        return new Person(
                person.getId(),
                person.getName(),
                person.getEmail(),
                person.getCpfCnpj(),
                person.getType()
        );
    }
}
