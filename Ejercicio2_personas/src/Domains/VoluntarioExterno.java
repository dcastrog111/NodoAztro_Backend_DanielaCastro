package Domains;

import Domains.abstracts.Voluntario;

public class VoluntarioExterno extends Voluntario {

    public VoluntarioExterno(String nombre, String apellido, String id, String tipo, float salario, float bono, String tipoVoluntario, String entidad) {
        super(nombre, apellido, id, tipo, salario, bono, tipoVoluntario, entidad);
    }

    @Override
    public void mostrarEntidad(String entidad) {

    }
}
