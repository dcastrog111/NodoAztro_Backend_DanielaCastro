package Domains.abstracts;

public abstract class Persona {

    private String nombre;
    private String apellido;
    private String id;
    private String tipo;
    private float salario;
    private float porcBono;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String id, String tipo, float salario, float porcBono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.tipo = tipo;
        this.salario = salario;
        this.porcBono = porcBono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getPorcBono() {
        return porcBono;
    }

    public void setPorcBono(float porcBono) {
        this.porcBono = porcBono;
    }

    protected abstract void calcularBono();

}
