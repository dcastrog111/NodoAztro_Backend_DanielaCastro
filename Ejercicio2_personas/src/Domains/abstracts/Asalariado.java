package Domains.abstracts;

public abstract class Asalariado extends Persona {

    private String tipoAsalariado;
    private String departamento;
    private int fechaVinculacion;

    public Asalariado(String nombre, String apellido, String id, String tipo, float salario, float porcBono, String tipoAsalariado, String departamento, int fechaVinculacion) {
        super(nombre, apellido, id, tipo, salario, porcBono);
        this.tipoAsalariado = tipoAsalariado;
        this.departamento = departamento;
        this.fechaVinculacion = fechaVinculacion;
    }

    public String getTipoAsalariado() {
        return tipoAsalariado;
    }

    public void setTipoAsalariado(String tipoAsalariado) {
        this.tipoAsalariado = tipoAsalariado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getFechaVinculacion() {
        return fechaVinculacion;
    }

    public void setFechaVinculacion(int fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }

    @Override
    protected void calcularBono() {

    }

    public abstract void CalcularAntiguedad();

}
