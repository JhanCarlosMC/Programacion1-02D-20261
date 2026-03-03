package co.edu.uniquindio.veterinaria;

public class Veterinaria {
    private String nit;
    private String nombre;
    private String direccion;

    private Mascota[] listMascotas;
    private Propietario[] listPropietarios;

    public Veterinaria(String nit, String nombre, String direccion) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        listMascotas = new Mascota[30];
        listPropietarios = new Propietario[30];
    }

    // Metodos CRUD propietario
    // Create - Crear/Registrar/Guardar propietarios
    public boolean registrarPropietario(String cedula, String nombre, String direccion, String numeroContacto) {
        Propietario nuevoPropietario = new Propietario(cedula, nombre, numeroContacto, direccion);

        if (buscarPropietarioByCedula(cedula) == -1) {
            for (int i = 0; i < listPropietarios.length; i++) {
                if (listPropietarios[i] == null) {
                    listPropietarios[i] = nuevoPropietario;
                    return true;
                }
            }
        }

        return false;
    }

    public int buscarPropietarioByCedula(String cedulaBuscar) {

        for (int i = 0; i < listPropietarios.length; i++) {
            if (listPropietarios[i] != null
                    && listPropietarios[i].getCedula().equals(cedulaBuscar)) {
                return i;
            }
        }
        return -1;
    }

    // Delete - Eliminar propietario
    public boolean eliminarPropietario(String cedula) {
        int posicion = buscarPropietarioByCedula(cedula);
        if (posicion != -1) {
            listPropietarios[posicion] = null;
            return true;
        }
        return false;
    }

    // Update - Actualizar propietario
    public boolean actualizarPropietario(String cedula, String nombre, String direccion, String numeroContacto) {
        int posicion = buscarPropietarioByCedula(cedula);
        if (posicion != -1) {
            listPropietarios[posicion].setNombre(nombre);
            listPropietarios[posicion].setDireccion(direccion);
            listPropietarios[posicion].setNumeroContacto(numeroContacto);
            return true;
        }
        return false;
    }

    // Read - Mostrar propietario
    public Propietario mostrarPropietario(String cedula) {
        int posicion = buscarPropietarioByCedula(cedula);
        if (posicion != -1) {
            return listPropietarios[posicion];
        }
        return null;
    }

    // Read - Mostrar lista de propietarios
    public String mostrarListaPropietarios() {
        String lista = "";
        for (int i = 0; i < listPropietarios.length; i++) {
            if (listPropietarios[i] != null) {
                lista += "Cedula: " + listPropietarios[i].getCedula()
                        + " | Nombre: " + listPropietarios[i].getNombre()
                        + " | Direccion: " + listPropietarios[i].getDireccion()
                        + " | Contacto: " + listPropietarios[i].getNumeroContacto() + "\n";
            }
        }
        return lista.isEmpty() ? "No hay propietarios registrados." : lista;
    }

    // Metodos CRUD propietario

    // Metodos CRUD mascota
    // Create - Registrar mascota (requiere propietario existente)
    public boolean registrarMascota(String id, String nombre, int edad,
            String raza, String especie, String cedulaPropietario) {

        int posPropietario = buscarPropietarioByCedula(cedulaPropietario);

        if (posPropietario == -1) {
            return false;
        }

        Propietario propietario = listPropietarios[posPropietario];
        Mascota nuevaMascota = new Mascota(id, nombre, edad, raza, especie);
        nuevaMascota.setThePropietario(propietario);
        propietario.setMascota(nuevaMascota);

        if (buscarMascotaById(id) == -1) {
            for (int i = 0; i < listMascotas.length; i++) {
                if (listMascotas[i] == null) {
                    listMascotas[i] = nuevaMascota;
                    return true;
                }
            }
        }

        return false;
    }

    public int buscarMascotaById(String idBuscar) {
        for (int i = 0; i < listMascotas.length; i++) {
            if (listMascotas[i] != null
                    && listMascotas[i].getId().equals(idBuscar)) {
                return i;
            }
        }
        return -1;
    }

    // Delete - Eliminar mascota
    public boolean eliminarMascota(String id) {
        int posicion = buscarMascotaById(id);
        if (posicion != -1) {
            listMascotas[posicion] = null;
            return true;
        }
        return false;
    }

    // Update - Actualizar mascota
    public boolean actualizarMascota(String id, String nombre, int edad,
            String raza, String especie, String nombrePropietario,
            String numeroContacto) {
        int posicion = buscarMascotaById(id);
        if (posicion != -1) {
            listMascotas[posicion].setNombre(nombre);
            listMascotas[posicion].setEdad(edad);
            listMascotas[posicion].setRaza(raza);
            listMascotas[posicion].setEspecie(especie);
            listMascotas[posicion].setNombrePropietario(nombrePropietario);
            listMascotas[posicion].setNumeroContacto(numeroContacto);
            return true;
        }
        return false;
    }

    // Read - Mostrar mascota
    public Mascota mostrarMascota(String id) {
        int posicion = buscarMascotaById(id);
        if (posicion != -1) {
            return listMascotas[posicion];
        }
        return null;
    }

    // Read - Mostrar lista de mascotas
    public String mostrarListaMascotas() {
        String lista = "";
        for (int i = 0; i < listMascotas.length; i++) {
            if (listMascotas[i] != null) {
                lista += "ID: " + listMascotas[i].getId()
                        + " | Nombre: " + listMascotas[i].getNombre()
                        + " | Edad: " + listMascotas[i].getEdad()
                        + " | Raza: " + listMascotas[i].getRaza()
                        + " | Especie: " + listMascotas[i].getEspecie()
                        + " | Propietario: " + listMascotas[i].getNombrePropietario()
                        + " | Contacto: " + listMascotas[i].getNumeroContacto() + "\n";
            }
        }
        return lista.isEmpty() ? "No hay mascotas registradas." : lista;
    }

    // Metodos CRUD mascota

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

    public Mascota[] getListMascotas() {
        return listMascotas;
    }

    public void setListMascotas(Mascota[] listMascotas) {
        this.listMascotas = listMascotas;
    }

    public Propietario[] getListPropietarios() {
        return listPropietarios;
    }

    public void setListPropietarios(Propietario[] listPropietarios) {
        this.listPropietarios = listPropietarios;
    }
}
