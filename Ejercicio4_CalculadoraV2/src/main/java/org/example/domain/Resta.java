package org.example.domain;

public class Resta extends Operaciones{

    public Resta() {
    }

    @Override
    public float calcular ( int num1, int num2){

        float result;
        result = num1 - num2;
        return result;
    }
}
