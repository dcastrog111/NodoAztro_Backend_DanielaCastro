package org.example.domain;


public class Suma extends Operaciones{

    public Suma() {
    }

    @Override
    public float calcular ( int num1, int num2){

        float result;
        result = num1 + num2;
        return result;
    }
}
