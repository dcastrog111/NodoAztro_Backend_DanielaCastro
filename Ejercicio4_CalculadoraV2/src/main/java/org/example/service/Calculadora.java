package org.example.service;

import org.example.domain.*;
import java.util.Scanner;

public class Calculadora {

    public void calcular(){

        Suma sum = new Suma();
        Resta res = new Resta();
        Division div = new Division();
        Multiplicacion mul = new Multiplicacion();
        Potencia pot = new Potencia();
        SeleccionarOpe selOpe = new SeleccionarOpe();

        Scanner sc = new Scanner(System.in);

        int ope;

        try {
            System.out.println("Ingrese número uno");
            int num1 = sc.nextInt();

            System.out.println("Ingrese número dos");
            int num2 = sc.nextInt();

            try{
                ope = selOpe.selectOpe();
                switch (ope){
                    case 1:
                        System.out.println("la suma es: "+sum.calcular(num1,num2));
                        break;

                    case 2:
                        System.out.println("la resta es: "+res.calcular(num1,num2));
                        break;

                    case 3:
                        System.out.println("la multiplicación es: "+mul.calcular(num1,num2));
                        break;
                    case 4:
                        try{
                            System.out.println("la división es: "+div.calcular(num1,num2));

                        } catch (ArithmeticException e) {
                            System.out.println("No se puede dividir por cero");
                        }
                        break;
                    case 5:
                        System.out.println("la potencia es: "+pot.calcular(num1,num2));
                        break;
                    default:
                        System.out.println("No  se ingresó una opción válida");
                        break;
                }


            } catch (Exception e) {

                System.out.println("Debe ingresar una opción entre 1-5");
            }

        }catch (Exception e){

            System.out.println("Debe ingresar un número entero");
        }
    }
}
