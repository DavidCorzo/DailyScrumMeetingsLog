/**
 * ex47 are factors
 */
public class ex47 {
    public static boolean areFactors(int n, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (n % array[i] != 0) {
                System.out.println(array[i]);
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = { 10, 100 };
        int n = 100;
        System.out.println(areFactors(n, array));
    }
}
