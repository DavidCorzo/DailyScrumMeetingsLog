import java.util.Scanner;

/**
 * recursividad_4 39) Realice la función pow de manera recursiva
 */
public class recursividad_39 {
    // Implementar una función que reciba como primer argumento la base y segundo el
    // exponente usando recursión.
    public static void main(String[] args) {
        System.out.println("    39) Pow");
        System.out.println("Ingese una base: ");
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();
        System.out.println("Ingrese un exponente: ");
        int n = obj.nextInt();
        System.out.println("pow(" + x + "," + n + ") = " + (pow(x, n)));
    }

    public static int pow(int x, int n) {
        // Treat the exponent as a counter
        if (n == 0) {
            return 1;
        } else {
            // System.out.println(n + " " + x);
            return x * pow(x, n - 1);
        }
    }
}
