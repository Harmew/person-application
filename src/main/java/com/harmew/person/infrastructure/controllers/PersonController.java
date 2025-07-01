package com.harmew.person.infrastructure.controllers;

import com.harmew.person.core.usecases.CreatePersonUseCase;
import com.harmew.person.core.usecases.GetAllPersonsUseCase;
import com.harmew.person.infrastructure.dtos.PersonDTO;
import com.harmew.person.infrastructure.mappers.PersonDTOMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
@AllArgsConstructor
public class PersonController {

    private final CreatePersonUseCase createPersonUseCase;
    private final GetAllPersonsUseCase getAllPersonsUseCase;
    private final PersonDTOMapper personDTOMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PersonDTO createPerson(@RequestBody PersonDTO dto) {
        return personDTOMapper
                .toDTO(createPersonUseCase.execute(personDTOMapper
                        .toDomain(dto)));
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PersonDTO> getAllPersons() {
        return getAllPersonsUseCase.execute().stream().map(personDTOMapper::toDTO).toList();
    }
}