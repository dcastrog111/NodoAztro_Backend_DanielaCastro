package Services;


import Domains.PersonalAdmvo;

public class Main {

    public static void main(String[] args) {


        PersonalAdmvo admo1 = new PersonalAdmvo("María", "Pérez",
                "1039459963", "Aux Admo", 3000, 0.10F, "Administrativo",
                "Facultad Ingenieria",2022);

        System.out.println("Antiguedad:");
        admo1.CalcularAntiguedad();
        System.out.println("Salario:");
        admo1.mostarSalario();

    }
}
