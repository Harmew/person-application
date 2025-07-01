package com.harmew.person.infrastructure.gateways;

import com.harmew.person.core.entities.Person;
import com.harmew.person.core.gateways.PersonGateway;
import com.harmew.person.infrastructure.mappers.PersonEntityMapper;
import com.harmew.person.infrastructure.persistence.PersonEntity;
import com.harmew.person.infrastructure.persistence.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PersonRepositoryGateway implements PersonGateway {

    private final PersonRepository personRepository;
    private final PersonEntityMapper personEntityMapper;

    @Override
    public Person createPerson(Person person) {
        return personEntityMapper
                .toDomain(personRepository.save(personEntityMapper
                        .toEntity(person)));
    }

    @Override
    public Person findByCpfCnpj(String cpfCnpj) {
        PersonEntity person = personRepository.findByCpfCnpj(cpfCnpj);
        if (person == null) {
            return null;
        }
        return personEntityMapper.toDomain(person);
    }

    @Override
    public List<Person> obtainAllPersons() {
        return personRepository.findAll().stream().map(personEntityMapper::toDomain).toList();
    }
}
