package org.example.domain;

public class Multiplicacion extends Operaciones{

    public Multiplicacion() {
    }

    @Override
    public float calcular ( int num1, int num2) throws RuntimeException {

        float result;
        result = num1 * num2;
        return result;
    }
}
