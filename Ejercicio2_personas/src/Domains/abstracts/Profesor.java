package Domains.abstracts;

public abstract class Profesor extends Asalariado {

    private String vinculacion;

    public Profesor(String nombre, String apellido, String id, String tipo, float salario, float bono, String tipoAsalariado, String departamento, int fechaVinculacion) {
        super(nombre, apellido, id, tipo, salario, bono, tipoAsalariado, departamento, fechaVinculacion);
    }

    @Override
    public void CalcularAntiguedad() {

    }

}
