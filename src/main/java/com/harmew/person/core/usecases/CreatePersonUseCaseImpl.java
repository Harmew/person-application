package com.harmew.person.core.usecases;

import com.harmew.person.core.entities.Person;
import com.harmew.person.core.exceptions.BusinessException;
import com.harmew.person.core.gateways.PersonGateway;

public class CreatePersonUseCaseImpl implements CreatePersonUseCase {

    private final PersonGateway personGateway;

    public CreatePersonUseCaseImpl(PersonGateway personGateway) {
        this.personGateway = personGateway;
    }

    @Override
    public Person execute(Person person) {
        Person existingPerson = personGateway.findByCpfCnpj(person.cpfCnpj());
        if (existingPerson != null) {
            throw new BusinessException("This person with this cpfCnpj has already been created");
        }
        return personGateway.createPerson(person);
    }
}
