/**
 * recursividad_3
 * 38) Dado un String se debe de invertir el String, utilizando recursión 
 */
public class recursividad_38 {

    public static void main(String[] args) {
        //
        System.out.println("Normal: Programacion II");
        System.out.println("Invertido: " + reverse_chain("Programacion II"));
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
