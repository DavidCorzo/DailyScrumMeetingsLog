
public class ex43 {

    public static int[] cloneArray(int[] a) {
        int[] copy = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            copy[i] = a[i];
        }
        return copy;
    }

    public static void main(String[] args) {
        int[] intiger_array = { 5, 3, 6, 7, 1 };
        int[] example = cloneArray(intiger_array);
        for (int i = 0; i < example.length; i++) {
            System.out.println("array[" + i + "] = " + example[i]);
        }
    }
}
