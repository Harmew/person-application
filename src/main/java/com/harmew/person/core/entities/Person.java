package com.harmew.person.core.entities;

import com.harmew.person.core.enums.PersonType;

public record Person(
        Long id,
        String name,
        String email,
        String cpfCnpj,
        PersonType type
) {
}
