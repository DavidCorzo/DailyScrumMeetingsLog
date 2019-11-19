/**
 * ex48 target
 */
public class ex48 {
    public static int target_is_in_array(int n, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                System.out.println("It is in the array and in the index: " + i);
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 100 };
        int n = 100;
        System.out.println(target_is_in_array(n, array));
    }
}
