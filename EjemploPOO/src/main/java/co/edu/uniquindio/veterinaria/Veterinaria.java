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

    //Metodos CRUD propietario
    //Create - Crear/Registrar/Guardar propietarios
//    public boolean registrarPropietario(String cedula, String nombre, String direccion, String numeroContacto){
//
//
//    }

    public int buscarPropietarioByCedula(String cedulaBuscar){

        for(int i = 0; i<listPropietarios.length; i++){
            if(listPropietarios[i] != null
                    && listPropietarios[i].getCedula().equals(cedulaBuscar)){
                return i;
            }
        }
        return -1;
    }

    //Metodos CRUD propietario

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
