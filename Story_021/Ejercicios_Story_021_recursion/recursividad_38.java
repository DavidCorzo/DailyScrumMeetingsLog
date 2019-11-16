import java.util.Scanner;

/**
 * recursividad_3 38) Dado un String se debe de invertir el String, utilizando
 * recursión
 */
public class recursividad_38 {

    public static void main(String[] args) {
        System.out.println("    38) Reverse String");
        System.out.println("Ingrese un string: ");
        Scanner obj = new Scanner(System.in);
        String string = obj.nextLine();
        System.out.println("Invertido: " + reverse_chain(string));
    }

    public static String reverse_chain(String chain) {
        //
        if (chain.length() <= 1) {
            return chain;
        } else {
            int len = chain.length();
            return reverse_chain(chain.substring(1, len)) + chain.charAt(0);
        }

    }
}
