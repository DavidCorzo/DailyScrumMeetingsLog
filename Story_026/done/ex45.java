import java.util.Scanner;

/**
 * ex45
 */
public class ex45 {

    public static int randomDouble(int low, int high) {
        if (low > high) {
            int temp = low;
            low = high;
            high = temp;
        }
        int limit = high - 1;
        int random = (int) (low + ((Math.random()) * (limit - low)));

        return random;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese low: ");
        int low = obj.nextInt();
        System.out.println("Ingrese un high: ");
        int high = obj.nextInt();
        System.out.println("Numero random: " + randomDouble(low, high));
    }
}
