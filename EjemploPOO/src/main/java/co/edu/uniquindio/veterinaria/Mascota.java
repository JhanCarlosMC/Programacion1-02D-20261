package co.edu.uniquindio.veterinaria;

public class Mascota {
    //Atributos de clase
    private String id;
    private String nombre;
    private int edad;
    private String raza;
    private String especie;
    private String nombrePropietario;
    private String numeroContacto;

    private Propietario thePropietario;

    //Contructor
    public Mascota(String id, String nombre, int edad,
                   String raza, String especie, String nombrePropietario,
                   String numeroContacto) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.especie = especie;
        this.nombrePropietario = nombrePropietario;
        this.numeroContacto = numeroContacto;
    }

    //Getters y Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public Propietario getThePropietario() {
        return thePropietario;
    }

    public void setThePropietario(Propietario thePropietario) {
        this.thePropietario = thePropietario;
    }
}
