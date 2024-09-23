package org.example.domain;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Administrador extends Persona{

    private String department;
    private String user;

    public Administrador(String birthDate) {
        super(birthDate);
    }

    public Administrador(String id, String name, String lastName, String birthDate, String address, int telephone, String department, String user) {
        super(id, name, lastName, birthDate, address, telephone);
        this.department = department;
        this.user = user;
    }
}
