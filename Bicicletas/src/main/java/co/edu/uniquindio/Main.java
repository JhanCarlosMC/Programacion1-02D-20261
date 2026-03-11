package co.edu.uniquindio;

import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate fechaIngreso = LocalDate.of(2026,3,5);

        OrdenServicio newOrden = new OrdenServicio(
                "O-1","limpieza",
                fechaIngreso, LocalDate.of(2026,3,6),
                1000.0
        );

        newOrden.setEstado(EstadoOrden.RECIBIDA);
        JOptionPane.showMessageDialog(
                null,newOrden.getEstado());

    }
}