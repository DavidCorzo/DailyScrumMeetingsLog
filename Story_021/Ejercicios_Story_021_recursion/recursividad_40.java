/**
 * recursividad_5
 * 40) Realizar una función recursiva que verifique si un número es par 
 */
public class recursividad_40 {
    public static void main(String[] args) {
        //
        int x = 9901;
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
