package org.example.domain;

public class Division extends Operaciones{

    public Division() {
    }

    @Override
    public float calcular ( int num1, int num2) throws ArithmeticException {

        float result = num1 / num2;
        return result;
    }
}
