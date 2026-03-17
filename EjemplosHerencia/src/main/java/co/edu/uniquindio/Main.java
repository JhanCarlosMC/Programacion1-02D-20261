package co.edu.uniquindio;

import co.edu.uniquindio.ejemplopersona.Cliente;
import co.edu.uniquindio.ejemplopersona.Empleado;
import co.edu.uniquindio.ejemplopersona.Persona;

public class Main {
    public static void main(String[] args) {
        Cliente newCliente =
                new Cliente("Jhan", "1234",
                        "1234", "la casa");

        Empleado newEmpleado =
                new Empleado("JhanCarlos", "1234",
                "jefe", 10000);

        System.out.println(newCliente);
        System.out.println(newEmpleado);

        Persona newPersona = new Empleado("Jose", "23","jefe", 10000);
    }
}