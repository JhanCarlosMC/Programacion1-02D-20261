package co.edu.uniquindio;

import javax.swing.*;

public class Fibonacci {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, fibonacci(8));
    }

    public static String fibonacci(int n){
        int primero = 0;
        int segundo = 1;
        String mensaje = "";

        if(n > 0){
            mensaje += primero + " ";
        }
        if(n > 1){
            mensaje += segundo  + " ";
        }
        if(n > 2){
            for(int i= 3; i<=n; i++){
                int tercero = primero + segundo;
                primero = segundo;
                segundo = tercero;

                mensaje += tercero + " ";
            }
        }
        return mensaje;
    }
}
