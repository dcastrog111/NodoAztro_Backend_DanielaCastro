package org.example.domain;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;

@Setter
@Getter
public class Cliente extends Persona{

    private String homeCity;
    private String country;

    private ArrayList<String> listDestination = new ArrayList<>();

    public Cliente(String birthDate) {
        super(birthDate);
    }

    public Cliente(String id, String name, String lastName, String birthDate, String address, String telephoneType, String telephone, String email, String country, String homeCity) {
        super(id, name, lastName, birthDate, address, telephoneType, telephone, email);
        this.country = country;
        this.homeCity = homeCity;
    }

    public void addDestination (String destination){
        listDestination.add(destination);
    }

}
