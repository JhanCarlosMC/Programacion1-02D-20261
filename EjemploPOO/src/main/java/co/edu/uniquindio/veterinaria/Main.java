package co.edu.uniquindio.veterinaria;

public class Main {
    //1.Iniciar el programa
    //2.Solicitar informacion al usuario
    //3.Mostrar informacion al usuario
    public static void main(String[] args) {
        Veterinaria newVeterinaria = new Veterinaria("12-0", "Animales Felices", "La plaza");

        System.out.println(newVeterinaria.buscarPropietarioByCedula("1234"));;
    }
}
