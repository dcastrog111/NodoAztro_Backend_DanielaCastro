package org.example.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GestorViajes extends Persona{

    private String zone;
    private float commission;

    public GestorViajes(String birthDate) {
        super(birthDate);
    }

    public GestorViajes(String id, String name, String lastName, String birthDate, String address, int telephone, String zone, float commission) {
        super(id, name, lastName, birthDate, address, telephone);
        this.zone = zone;
        this.commission = commission;
    }
}
