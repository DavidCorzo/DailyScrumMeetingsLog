/**
 * recursividad_4
 * 39) Realice la función pow de manera recursiva 
 */
public class recursividad_39 {
    // Implementar una función que reciba como primer argumento la base y segundo el
    // exponente usando recursión.
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
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
