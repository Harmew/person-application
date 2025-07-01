package com.harmew.person.core.usecases;

import com.harmew.person.core.entities.Person;
import com.harmew.person.core.gateways.PersonGateway;

import java.util.List;

public class GetAllPersonsUseCaseImpl implements GetAllPersonsUseCase {

    private final PersonGateway personGateway;

    public GetAllPersonsUseCaseImpl(PersonGateway personGateway) {
        this.personGateway = personGateway;
    }

    @Override
    public List<Person> execute() {
        return personGateway.obtainAllPersons();
    }
}
