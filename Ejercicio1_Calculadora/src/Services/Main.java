package Services;

import Operation.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float num1;
        float num2;
        int operacion;

        Sumar sumar = new Sumar();
        Restar restar = new Restar();
        Multiplicar  multiplicar = new Multiplicar();
        Dividir dividir = new Dividir();

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número");
        num1 = sc.nextFloat();

        System.out.println("Ingrese otro número");
        num2 = sc.nextFloat();


        System.out.println("Que operación quiere realizar: " +
                "Suma(1), Resta(2), Multiplicación(3), División(4), Todas(5)");

        operacion = sc.nextInt();

        switch (operacion){

            case 1:
                sumar.operar(num1, num2);
                break;
            case 2:
                restar.operar(num1, num2);
                break;
            case 3:
                multiplicar.operar(num1,num2);
                break;
            case 4:
                dividir.operar(num1, num2);
                break;
            case 5:
                sumar.operar(num1, num2);
                System.out.println();
                restar.operar(num1, num2);
                System.out.println();
                multiplicar.operar(num1, num2);
                System.out.println();
                dividir.operar(num1, num2);
                break;
        }

    }
}
