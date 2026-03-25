package co.edu.uniquindio;

import co.edu.uniquindio.ejemplopersona.Cliente;
import co.edu.uniquindio.ejemplopersona.Empleado;
import co.edu.uniquindio.ejemplopersona.Persona;

public class Main {
    public static void main(String[] args) {
        Caja newCaja = new Caja("cajaUno", 15);
        System.out.println(newCaja);
        System.out.println(newCaja.nombre() = "Hola");
        System.out.println(newCaja.tam());

        Cliente newCliente =
                new Cliente("Jhan", "1234",
                        "1234", "la casa");

        Cliente newCliente2 = new Cliente("Jhan", "1234");

        Calculadora calculadora = new Calculadora();
        calculadora.suma(1,2);
        calculadora.suma(1.1,2.1);
        calculadora.suma("1","2");

        Empleado newEmpleado =
                new Empleado("JhanCarlos", "1234",
                "jefe", 10000);

        System.out.println(newCliente);
        System.out.println(newEmpleado);

        Persona newPersona = new Empleado("Jose", "23","jefe", 10000);
    }
}