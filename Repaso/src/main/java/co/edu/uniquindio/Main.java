package co.edu.uniquindio;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
//        String nombreUsuario;
//        nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre:");
//        JOptionPane.showMessageDialog
//                (null, "Hola " + nombreUsuario);

//        if(verificarNumeroPrimo(73)){
//            JOptionPane.showMessageDialog
//                    (null, "El numero es primo");
//        }else{
//            JOptionPane.showMessageDialog
//                    (null, "El numero no es primo");
//        }
//        String valorString = JOptionPane.showInputDialog("Ingrese el valor:");
//        int valorInt = Integer.parseInt(valorString);

        int numeroVerificar =
                Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
        int[] numerosResultado = busquedaImpares(numeroVerificar);

        String resultado = "";
        for (int i = 0; i < numerosResultado.length; i++) {
            resultado += numerosResultado[i] + " ";
        }

        JOptionPane.showMessageDialog(null, resultado);

    }
    // Escribe un programa que reciba un número entero y
    // luego imprima todos los números impares entre 1 y
    // ese número. Utiliza un ciclo for con una condición
    // if dentro para filtrar los impares.
    public static int[] busquedaImpares(int numeroVerificar){
        int cont = 0;
        int indexArreglo = 0;
        int[] numerosImpares;

        for(int i = 1; i<=numeroVerificar; i++){
            if(i % 2 != 0){
                cont++;
            }
        }

        numerosImpares = new int[cont];

        for(int i = 1; i<=numeroVerificar; i++){
            if(i % 2 != 0){
                numerosImpares[indexArreglo] = i;
                indexArreglo++;
            }
        }
        return numerosImpares;
    }

    public static boolean verificarNumeroPrimo(int numeroVerificar){
        boolean resultado = true;
        int cont = 0;
        for(int i = 2; i<=numeroVerificar/2; i++){
            if(numeroVerificar % i == 0){
                cont++;
            }
        }
        if (cont != 0) {
            resultado = false;
        }
        return resultado;
    }


}