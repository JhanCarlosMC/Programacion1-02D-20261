package co.edu.uniquindio.cicla;

//Clase Java
public class Cicla {

    //Atributos de clase
    private String id;
    private String nombre;
    private boolean freno;
    private String color;
    private int tallaRin;
//    private boolean suspencion;
//    private boolean transmision;
//    private String tipoPlato;

    //Metodo Constructor -> metodo para crear instacias de clase (Objetos)
    public Cicla(String id, String nombre,
                 boolean freno, String color, int tallaRin) {
        this.id = id;
        this.nombre = nombre;
        this.freno = freno;
        this.color = color;
        this.tallaRin = tallaRin;
    }

    //Metodos
    public void acelerar() {
        //Codigo de acelerar
        System.out.println("Acelerando");
    }
    public void frenar(){
        //codigo de frenar
        System.out.println("Frenando");
    }

    @Override
    public String toString() {
        return "Id:"+ id +" Nombre: " + nombre +
                " Freno: " + freno + " Color: " +
                color + " TallaRin: " + tallaRin;
    }

    //Metodo Get - Para obtener datos
    public String getNombre() {
        return nombre;
    }
    //Metodo Set - Para asignar datos
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isFreno() {
        return freno;
    }

    public void setFreno(boolean freno) {
        this.freno = freno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTallaRin() {
        return tallaRin;
    }

    public void setTallaRin(int tallaRin) {
        this.tallaRin = tallaRin;
    }
}
