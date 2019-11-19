import java.util.Scanner;

/**
 * thirteen
 */
public class ex44 {

    public static double randomDouble(double low, double high) {
        if (low > high) {
            double temp = low;
            low = high;
            high = temp;
        }
        return (low + ((Math.random()) * (high - low)));
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese low: ");
        double low = obj.nextDouble();
        System.out.println("Ingrese un high: ");
        double high = obj.nextDouble();
        System.out.println("Numero random: " + randomDouble(low, high));
    }
}
