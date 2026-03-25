package co.edu.uniquindio;

public record Caja(String nombre, int tam) {

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
    }

}
