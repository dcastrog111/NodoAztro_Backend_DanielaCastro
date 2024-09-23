package org.example.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Persona {

    private String id;
    private String name;
    private String lastName;
    private final String birthDate;
    private String address;
    private int telephone;

    public Persona(String birthDate) {
        this.birthDate = birthDate;
    }

    public Persona(String id, String name, String lastName, String birthDate, String address, int telephone) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.telephone = telephone;
    }
}
