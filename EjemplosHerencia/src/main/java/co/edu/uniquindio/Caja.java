package co.edu.uniquindio;

import co.edu.uniquindio.ejemplopersona.Cliente;

public record Caja(String nombre, int tam, TipoCaja tipo){

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
    }

}
