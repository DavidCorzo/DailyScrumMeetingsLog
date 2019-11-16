import java.util.Scanner;

/**
 * recursividad_5 40) Realizar una función recursiva que verifique si un número
 * es par
 */
public class recursividad_40 {
    public static void main(String[] args) {
        //
        System.out.println("    40) Paridad");
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int x = obj.nextInt();
        System.out.println("Es " + x + " par o impar?");
        // System.out.println("If 1 is the remainder then it's odd. Else remainder is
        // 0.");
        // System.out.println("Is even? " + is_even(x));
        int suspect = is_even(x);
        if (suspect == 1) {
            System.out.println("Impar");
        } else {
            System.out.println("Even");
        }
    }

    public static int is_even(int x) {
        if (x == 0 || x == 1) {
            return x;
        } else {
            return is_even(x - 2);
        }
    }
}
