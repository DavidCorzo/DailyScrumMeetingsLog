import java.util.LinkedList;

/**
 * SobreCarga; Caso de una empresa que busca datos estadísticos acerca de cuanto
 * gana cada empleado.
 */
public class SobreCarga {
    LinkedList<String> att1;

    SobreCarga(LinkedList<String> base) {
        // Constructor
        this.att1 = base;
    }

    public void salario(String id, String numero_de_tel, double salario, String correo_electronico) {
        // '''Agrega argumentos a una lista.'''
        this.att1.add(id);
        System.out.println("id agregado." + id);
        String aux;
        this.att1.add(numero_de_tel);
        System.out.println("Numero de telefono agregado " + numero_de_tel);
        aux = String.valueOf(salario);
        this.att1.add(aux);
        System.out.println("Salario agregado " + aux);
        this.att1.add(correo_electronico);
        System.out.println("Correo electronico agregado " + correo_electronico);
    }

    public void salario(String id, double salario) {
        this.att1.add(id);
        System.out.println("id agregado " + id);
        String aux;
        aux = String.valueOf(salario);
        System.out.println("salario agregado " + salario);
        this.att1.add(aux);
    }
}
