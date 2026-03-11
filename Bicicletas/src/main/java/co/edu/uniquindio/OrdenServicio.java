package co.edu.uniquindio;

import java.time.LocalDate;

public class OrdenServicio {
    private String codigo;
    private String descripcion;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private double costo;
    private EstadoOrden estado;

    public OrdenServicio(String codigo, String descripcion, LocalDate fechaIngreso, LocalDate fechaSalida, double costo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaIngreso;
        this.costo = costo;
    }

    public EstadoOrden getEstado() {
        return estado;
    }

    public void setEstado(EstadoOrden estado) {
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
