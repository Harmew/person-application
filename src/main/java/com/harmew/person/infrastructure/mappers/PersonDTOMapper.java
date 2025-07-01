package com.harmew.person.infrastructure.mappers;

import com.harmew.person.core.entities.Person;
import com.harmew.person.infrastructure.dtos.PersonDTO;
import org.springframework.stereotype.Component;

@Component
public class PersonDTOMapper {

    public PersonDTO toDTO(Person person) {
        return new PersonDTO(
                person.name(),
                person.email(),
                person.cpfCnpj(),
                person.type()
        );
    }

    public Person toDomain(PersonDTO person) {
        return new Person(
                null,
                person.name(),
                person.email(),
                person.cpfCnpj(),
                person.type()
        );
    }
}
