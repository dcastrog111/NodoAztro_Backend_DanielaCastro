package org.example.service;

import java.util.Scanner;

public class SeleccionarOpe {

    public int selectOpe() throws Exception {

        int ope = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Que operación quiere realizar: " +
                "Suma(1), Resta(2), Multiplicación(3), " +
                "División(4), Potencia(5)");

        ope = sc.nextInt();
        return ope;
    }
}
