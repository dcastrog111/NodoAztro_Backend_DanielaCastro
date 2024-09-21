package org.example;

import org.example.domain.Administrador;
import org.example.domain.Cliente;

public class Main
{
    public static void main( String[] args )
    {
        Administrador p = new Administrador("27-07-1991");
        p.setId("11111");
        System.out.println(p.getId());
        p.setDepartment("Zona Norte");
        System.out.println(p.getDepartment());

        Cliente c1 = new Cliente("1123","Daniela","Castro","23-07-1993","Carrera80",123);

        c1.addDestination("Londres");
        c1.addDestination("Peru");
        c1.addDestination("Cuba");

        System.out.println(c1.getBirthDate());

        System.out.println(c1.getListDestination());
        System.out.println("El cliente "+c1.getName()+" ha viajado a: "+c1.getListDestination());


    }
}
