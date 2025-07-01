package com.harmew.person.infrastructure.dtos;

import com.harmew.person.core.enums.PersonType;

public record PersonDTO(
        String name,
        String email,
        String cpfCnpj,
        PersonType type
) {
}
