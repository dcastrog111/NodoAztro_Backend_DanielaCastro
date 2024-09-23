package org.example.domain;

public class Potencia extends Operaciones{

    public Potencia() {
    }

    @Override
    public float calcular(int num1, int num2) {

        float result = (float) Math.pow(num1,num2);
        return result;
    }
}
