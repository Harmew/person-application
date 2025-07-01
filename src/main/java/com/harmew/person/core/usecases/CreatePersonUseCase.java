package com.harmew.person.core.usecases;

import com.harmew.person.core.entities.Person;

public interface CreatePersonUseCase {
    Person execute(Person person);
}
