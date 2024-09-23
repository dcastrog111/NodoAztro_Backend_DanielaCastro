package org.example.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Lector {

    public void leerArchivo(){

        try {
            InputStream fis = new FileInputStream("archivoNumeros.txt");

            int value;
            System.out.println("Los números del archivo son:");
            while((value = fis.read()) != -1){
                System.out.print((char)value);
            }

        } catch (IOException e) {
            System.out.println("No se encontró el archivo");
        }
    }
}
