package Domains.abstracts;

public abstract class Voluntario extends Persona {

    private String tipoVoluntario;
    private String entidad;

    public Voluntario(String nombre, String apellido, String id, String tipo, float salario, float porcBono, String tipoVoluntario, String entidad) {
        super(nombre, apellido, id, tipo, salario, porcBono);
        this.tipoVoluntario = tipoVoluntario;
        this.entidad = entidad;
    }

    public String getTipoVoluntario() {
        return tipoVoluntario;
    }

    public void setTipoVoluntario(String tipoVoluntario) {
        this.tipoVoluntario = tipoVoluntario;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    @Override
    public void calcularBono() {
    }

    public abstract void mostrarEntidad(String entidad);

}
