package co.edu.uniquindio;

public class Main {
    public static void main(String[] args) {
        Empresa newEmpresa = new Empresa("123456789", "Empresa XYZ", "Calle 123");

        newEmpresa.agregarEmpleado("Juan Perez", 2500.0, true);
        newEmpresa.agregarEmpleado("Maria Gomez", 3000.0, true);
        newEmpresa.agregarEmpleado("Juan Perez", 5000.0, true);


        System.out.println(newEmpresa);
        System.out.println("---------------------------");
        newEmpresa.eliminarEmpleado("Juan Perez");
        System.out.println(newEmpresa);

    }
}