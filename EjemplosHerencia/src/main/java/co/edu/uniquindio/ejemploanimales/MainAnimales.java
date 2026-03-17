package co.edu.uniquindio.ejemploanimales;

public class MainAnimales {
    public static void main(String[] args) {
        Animal newAnimal = new Animal();
        Canino newCanino = new Canino();
        Felino newFelino = new Felino();
        Tigre newTigre = new Tigre();
        Gato newGato = new Gato();

        System.out.println(newAnimal.hacerRuido());
        System.out.println(newCanino.hacerRuido());
        System.out.println(newFelino.hacerRuido());
        System.out.println(newTigre.hacerRuido());
        System.out.println(newGato.hacerRuido());
    }
}
