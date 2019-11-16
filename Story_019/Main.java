import java.util.LinkedList;

/**
 * runner
 */
public class Main {
    public static void main(String[] args) {
        // Creo la instancia del objeto
        LinkedList<String> base = new LinkedList<String>();
        SobreCarga object = new SobreCarga(base);
        object.salario("Empleado_1", 35000);
        System.out.println("-----Sobre carga-----");
        object.salario("Empleado_1", "99001155", 31000, "empleado_1@company.com");
        // Diferentes argumentos determinará qué método se usará.
    }
}
