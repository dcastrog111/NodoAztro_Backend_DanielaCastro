package org.example.topics.generics;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Box<String> boxName = new Box<>();
        boxName.setContent("Daniela Castro");
        System.out.println(boxName.getContent());

        Box<Integer> boxNum = new Box<>();
        boxNum.setContent(123);
        System.out.println(boxNum.getContent());


        ArrayList <Person> listPerson = new ArrayList<>();
        listPerson.add( new Person("Daniela", "Castro", 31));
        listPerson.add( new Person("María", "Perez", 51));

        System.out.println(listPerson);


        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 10; i++){

            numbers.add(i);
        }

        Utilidades u = new Utilidades();
        u.imprimirArray(numbers);

        System.out.println();

        u.imprimirArray(listPerson);


    }
}
