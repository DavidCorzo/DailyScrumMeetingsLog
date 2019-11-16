import java.util.Scanner;

public class Story002 {
    private static int ejercicio_7() {
        Scanner obj = new Scanner(System.in);
        int sum, a, b;
        System.out.println("Enter first number: ");
        a = obj.nextInt();
        System.out.println("Enter second number: ");
        b = obj.nextInt();
        sum = a + b;
        return sum;
    }

    private static void ejercicio_8() {
        Scanner obj_0 = new Scanner(System.in);
        int num_siete = 7;
        int user_input = obj_0.nextInt();
        try {
            if (user_input == num_siete) {
                System.out.println("Numero de la suerte");
            } else {
                System.out.println("No numero de la suerte");
            }
        } catch (Exception ex) {
            System.out.println(" exception ocurred, unable to process data type");
        }

    }

    public static void main(String[] args) {
        System.out.println("\nEjercicio #1");
        int sum = ejercicio_7();
        System.out.println("Sum " + sum);

        System.out.println("\nEjercicio #2");
        ejercicio_8();

        // System.out.println("");

        // System.out.println("");

        // System.out.println("");
    }
}
