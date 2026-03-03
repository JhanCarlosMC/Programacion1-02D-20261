package co.edu.uniquindio.veterinaria;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Veterinaria newVeterinaria = new Veterinaria("12-0", "Animales Felices", "La plaza");
//        cargarDatos(newVeterinaria);

        int opcion = 0;

        while (opcion != 11) {
            String menu = "===== VETERINARIA ANIMALES FELICES =====\n"
                    + "1. Registrar propietario\n"
                    + "2. Eliminar propietario\n"
                    + "3. Actualizar propietario\n"
                    + "4. Mostrar propietario\n"
                    + "5. Mostrar lista de propietarios\n"
                    + "6. Registrar mascota\n"
                    + "7. Eliminar mascota\n"
                    + "8. Actualizar mascota\n"
                    + "9. Mostrar mascota\n"
                    + "10. Mostrar lista de mascotas\n"
                    + "11. Salir";

            String entrada = JOptionPane.showInputDialog(null, menu, "Menu Principal", JOptionPane.QUESTION_MESSAGE);

            if (entrada == null) {
                break;
            }

            opcion = Integer.parseInt(entrada);

            switch (opcion) {
                case 1:
                    String cedulaReg = JOptionPane.showInputDialog("Ingrese la cedula:");
                    String nombrePropReg = JOptionPane.showInputDialog("Ingrese el nombre:");
                    String direccionPropReg = JOptionPane.showInputDialog("Ingrese la direccion:");
                    String contactoPropReg = JOptionPane.showInputDialog("Ingrese el numero de contacto:");

                    boolean registrado = newVeterinaria.registrarPropietario(cedulaReg, nombrePropReg, direccionPropReg,
                            contactoPropReg);
                    JOptionPane.showMessageDialog(null,
                            registrado ? "Propietario registrado exitosamente."
                            : "No se pudo registrar el propietario.");
                    break;

                case 2:
                    String cedulaElim = JOptionPane.showInputDialog("Ingrese la cedula del propietario a eliminar:");

                    boolean eliminadoProp = newVeterinaria.eliminarPropietario(cedulaElim);
                    JOptionPane.showMessageDialog(null,
                            eliminadoProp ? "Propietario eliminado exitosamente." : "No se encontro el propietario.");
                    break;

                case 3:
                    String cedulaAct = JOptionPane.showInputDialog("Ingrese la cedula del propietario a actualizar:");
                    String nombrePropAct = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
                    String direccionPropAct = JOptionPane.showInputDialog("Ingrese la nueva direccion:");
                    String contactoPropAct = JOptionPane.showInputDialog("Ingrese el nuevo numero de contacto:");

                    boolean actualizadoProp = newVeterinaria.actualizarPropietario(cedulaAct, nombrePropAct,
                            direccionPropAct, contactoPropAct);
                    JOptionPane.showMessageDialog(null, actualizadoProp ? "Propietario actualizado exitosamente."
                            : "No se encontro el propietario.");
                    break;

                case 4:
                    String cedulaMostrar = JOptionPane.showInputDialog("Ingrese la cedula del propietario:");

                    Propietario propietario = newVeterinaria.mostrarPropietario(cedulaMostrar);
                    if (propietario != null) {
                        String infoProp = "Cedula: " + propietario.getCedula()
                                + "\nNombre: " + propietario.getNombre()
                                + "\nDireccion: " + propietario.getDireccion()
                                + "\nContacto: " + propietario.getNumeroContacto();
                        JOptionPane.showMessageDialog(null, infoProp, "Informacion del Propietario",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro el propietario.", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case 5:
                    String listaProp = newVeterinaria.mostrarListaPropietarios();
                    JOptionPane.showMessageDialog(null, listaProp, "Lista de Propietarios",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 6:
                    String idMascReg = JOptionPane.showInputDialog("Ingrese el ID de la mascota:");
                    String nombreMascReg = JOptionPane.showInputDialog("Ingrese el nombre de la mascota:");
                    int edadMascReg = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la mascota:"));
                    String razaMascReg = JOptionPane.showInputDialog("Ingrese la raza:");
                    String especieMascReg = JOptionPane.showInputDialog("Ingrese la especie:");
                    String cedulaPropMasc = JOptionPane.showInputDialog("Ingrese la cedula del propietario:");

                    boolean registradoMasc = newVeterinaria.registrarMascota(idMascReg, nombreMascReg, edadMascReg,
                            razaMascReg, especieMascReg, cedulaPropMasc);
                    JOptionPane.showMessageDialog(null, registradoMasc ? "Mascota registrada exitosamente."
                            : "No se pudo registrar la mascota. Verifique que el propietario exista.");
                    break;

                case 7:
                    String idMascElim = JOptionPane.showInputDialog("Ingrese el ID de la mascota a eliminar:");

                    boolean eliminadoMasc = newVeterinaria.eliminarMascota(idMascElim);
                    JOptionPane.showMessageDialog(null,
                            eliminadoMasc ? "Mascota eliminada exitosamente." : "No se encontro la mascota.");
                    break;

                case 8:
                    String idMascAct = JOptionPane.showInputDialog("Ingrese el ID de la mascota a actualizar:");
                    String nombreMascAct = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
                    int edadMascAct = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad:"));
                    String razaMascAct = JOptionPane.showInputDialog("Ingrese la nueva raza:");
                    String especieMascAct = JOptionPane.showInputDialog("Ingrese la nueva especie:");
                    String nombrePropMascAct = JOptionPane.showInputDialog("Ingrese el nuevo nombre del propietario:");
                    String contactoMascAct = JOptionPane.showInputDialog("Ingrese el nuevo numero de contacto:");

                    boolean actualizadoMasc = newVeterinaria.actualizarMascota(idMascAct, nombreMascAct, edadMascAct,
                            razaMascAct, especieMascAct, nombrePropMascAct, contactoMascAct);
                    JOptionPane.showMessageDialog(null,
                            actualizadoMasc ? "Mascota actualizada exitosamente." : "No se encontro la mascota.");
                    break;

                case 9:
                    String idMascMostrar = JOptionPane.showInputDialog("Ingrese el ID de la mascota:");

                    Mascota mascota = newVeterinaria.mostrarMascota(idMascMostrar);
                    if (mascota != null) {
                        String infoMasc = "ID: " + mascota.getId()
                                + "\nNombre: " + mascota.getNombre()
                                + "\nEdad: " + mascota.getEdad()
                                + "\nRaza: " + mascota.getRaza()
                                + "\nEspecie: " + mascota.getEspecie()
                                + "\nPropietario: " + mascota.getNombrePropietario()
                                + "\nContacto: " + mascota.getNumeroContacto();
                        JOptionPane.showMessageDialog(null, infoMasc, "Informacion de la Mascota",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro la mascota.", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case 10:
                    String listaMasc = newVeterinaria.mostrarListaMascotas();
                    JOptionPane.showMessageDialog(null, listaMasc, "Lista de Mascotas",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 11:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida. Intente de nuevo.", "Error",
                            JOptionPane.WARNING_MESSAGE);
                    break;
            }
        }
    }

    public static void cargarDatos(Veterinaria veterinaria) {
        // Registrar propietarios
        veterinaria.registrarPropietario("1001", "Carlos Martinez", "Calle 10 #5-20", "3101234567");
        veterinaria.registrarPropietario("1002", "Maria Lopez", "Carrera 15 #8-30", "3209876543");
        veterinaria.registrarPropietario("1003", "Juan Perez", "Avenida 20 #12-45", "3157654321");
        veterinaria.registrarPropietario("1004", "Ana Garcia", "Calle 5 #3-10", "3001112233");
        veterinaria.registrarPropietario("1005", "Pedro Ramirez", "Carrera 8 #15-60", "3184455667");

        // Registrar mascotas (vinculadas a propietarios existentes)
        veterinaria.registrarMascota("M001", "Firulais", 3, "Labrador", "Perro", "1001");
        veterinaria.registrarMascota("M002", "Michi", 2, "Siames", "Gato", "1002");
        veterinaria.registrarMascota("M003", "Rocky", 5, "Pastor Aleman", "Perro", "1003");
        veterinaria.registrarMascota("M004", "Luna", 1, "Persa", "Gato", "1004");
        veterinaria.registrarMascota("M005", "Max", 4, "Golden Retriever", "Perro", "1005");
    }
}
