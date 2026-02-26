package co.edu.uniquindio.cicla;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Cicla miBici =
                new Cicla("C-01","yucateco tactico",
                        true, "Camuflado", 26);

//        System.out.println(miBici.getNombre());
        JOptionPane.showMessageDialog(null, miBici);
        miBici.setNombre("Terreneitor");
        miBici.setColor("Rojo");
        miBici.setFreno(true);
        JOptionPane.showMessageDialog(null, miBici);
//        miBici.acelerar(); //llamado de metodo NO static
        //Cicla.acelerar(); //LLamado de metodo static
    }
}