package Domains;

import Domains.abstracts.Profesor;

public class ProfesorInterino extends Profesor {

    public ProfesorInterino(String nombre, String apellido, String id, String tipo, float salario, float bono, String tipoAsalariado, String departamento, int fechaVinculacion) {
        super(nombre, apellido, id, tipo, salario, bono, tipoAsalariado, departamento, fechaVinculacion);
    }
}
