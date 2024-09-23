package org.example.topics.generics;

import java.util.List;

public class Utilidades {

    public void imprimirArray(List<?> lista1) {

        for(Object x: lista1){
            System.out.print(x+" ");
        }

    }
}
