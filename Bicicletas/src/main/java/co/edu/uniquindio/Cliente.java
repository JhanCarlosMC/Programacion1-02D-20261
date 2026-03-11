package co.edu.uniquindio;

import java.time.LocalDate;
import java.util.LinkedList;

public class Cliente {
    private String nombre;
    private String identificacion;
    private String telefono;
    private int numeroBicicletas;
    private String direccion;
    private LocalDate fechaNacimiento;

    public Cliente(String nombre, String identificacion, String telefono, int numeroBicicletas, String direccion,
            LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.numeroBicicletas = numeroBicicletas;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNumeroBicicletas() {
        return numeroBicicletas;
    }

    public void setNumeroBicicletas(int numeroBicicletas) {
        this.numeroBicicletas = numeroBicicletas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
