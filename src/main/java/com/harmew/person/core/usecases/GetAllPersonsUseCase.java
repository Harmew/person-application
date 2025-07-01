package com.harmew.person.core.usecases;

import com.harmew.person.core.entities.Person;

import java.util.List;

public interface GetAllPersonsUseCase {
    List<Person> execute();
}
