package co.edu.uniquindio.ejemplopersona;

public class Cliente extends Persona{
    private String telefono;
    private String direccion;

    public Cliente(String nombre, String cedula, String telefono, String direccion) {
        super(nombre, cedula);
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre" + nombre + "\n" +
                "Cedula: " + cedula + "\n" +
                "Telefono: " + telefono + "\n" +
                "Direccion: " + direccion;
    }
}
