package org.example.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GestorViajes extends Persona{

    private String zone;
    private String startDate;
    private float salary;
    private String user;
    private String password;
    private float commission;

    public GestorViajes(String birthDate) {
        super(birthDate);
    }

    public GestorViajes(String id, String name, String lastName, String birthDate, String address, String telephoneType, String telephone, String email, String zone, String startDate, float salary, String user, String password, float commission) {
        super(id, name, lastName, birthDate, address, telephoneType, telephone, email);
        this.zone = zone;
        this.startDate = startDate;
        this.salary = salary;
        this.user = user;
        this.password = password;
        this.commission = commission;
    }
}
