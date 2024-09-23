package org.example;

import org.example.service.Calculadora;
import org.example.service.Lector;

public class Main
{
    public static void main( String[] args ) {

        Calculadora cal = new Calculadora();
        cal.calcular();

        System.out.println("---------------------------");

        Lector leer = new Lector();
        leer.leerArchivo();
    }

}
