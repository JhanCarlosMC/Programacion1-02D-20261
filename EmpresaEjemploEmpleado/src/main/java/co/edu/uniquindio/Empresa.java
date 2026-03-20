package co.edu.uniquindio;

import java.util.ArrayList;

public class Empresa {
    private String nit;
    private String nombre;
    private String direccion;

    private ArrayList<Empleado> listaEmpleados;

    public Empresa(String nit, String nombre, String direccion) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        listaEmpleados = new ArrayList<>();
    }

    public boolean agregarEmpleado(String nombre, double sueldo, boolean activo) {
        Empleado newEmpleado = new Empleado(nombre, sueldo, activo);
        listaEmpleados.add(newEmpleado);
        return true;
    }

    public boolean eliminarEmpleado(String nombre) {
        for (Empleado empleadoIndex: listaEmpleados) {
            if (empleadoIndex.getNombre().equals(nombre)) {
                listaEmpleados.remove(empleadoIndex);
                return true;
            }
        }
        return false;
    }


    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "listaEmpleados=" + listaEmpleados +
                '}';
    }
}
