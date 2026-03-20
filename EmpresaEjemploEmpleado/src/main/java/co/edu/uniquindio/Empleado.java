package co.edu.uniquindio;

public class Empleado {
    private String nombre;
    private double sueldo;
    private boolean activo;

    public Empleado(String nombre, double sueldo, boolean activo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", activo=" + activo +
                "\n}";
    }
}
