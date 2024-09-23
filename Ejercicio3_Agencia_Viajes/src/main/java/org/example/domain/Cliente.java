package org.example.domain;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;

@Setter
@Getter
public class Cliente extends Persona{

    private ArrayList<String> listDestination = new ArrayList<>();

    public Cliente(String birthDate) {
        super(birthDate);
    }

    public Cliente(String id, String name, String lastName, String birthDate, String address, int telephone) {
        super(id, name, lastName, birthDate, address, telephone);
    }

    public void addDestination (String destination){
        listDestination.add(destination);
    }

}
