package co.edu.uniquindio.salon;

public class Salon {
    //Relacion Asociacion
    private Curso[] listCursos;

    //Relacion Contament
    private Pared[] listaParedes;

    //Relacion Sharing
    private Pared[] listaParedesPrestadas;

    public Pared[] getListaParedes() {
        return listaParedes;
    }

    public void setListaParedes(Pared[] listaParedes) {
        this.listaParedes = listaParedes;
    }

    public Pared[] getListaParedesPrestadas() {
        return listaParedesPrestadas;
    }

    public void setListaParedesPrestadas(Pared[] listaParedesPrestadas) {
        this.listaParedesPrestadas = listaParedesPrestadas;
    }
}
