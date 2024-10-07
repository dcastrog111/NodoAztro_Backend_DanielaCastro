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
    private String telephoneType;
    private String telephone;
    private String email;

    public Persona(String birthDate) {
        this.birthDate = birthDate;
    }

    public Persona(String id, String name, String lastName, String birthDate, String address, String telephoneType, String telephone, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.telephoneType = telephoneType;
        this.telephone = telephone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", address='" + address + '\'' +
                ", telephoneType='" + telephoneType + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
