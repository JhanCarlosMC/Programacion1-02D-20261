package co.edu.uniquindio.ejemplopersona;

public class Empleado extends Persona{
    private String cargo;
    private double sueldo;

    public Empleado(String nombre, String cedula, String cargo, double sueldo) {
        super(nombre, cedula);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "cargo='" + cargo + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
