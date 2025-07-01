package com.harmew.person.infrastructure.persistence;

import com.harmew.person.core.enums.PersonType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "person")
@Table(name = "tb_person")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String cpfCnpj;
    @Enumerated(EnumType.STRING)
    private PersonType type;
}
