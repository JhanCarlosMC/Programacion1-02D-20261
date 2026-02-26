package co.edu.uniquindio;

public class Matriz {

    public static void main(String[] args) {
        int filas = 3;
        int columnas = 3;

        int[][] matriz = new int[filas][columnas];
//        matriz[0][0] = 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
