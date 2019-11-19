/**
 * ex49
 */
public class ex49 {

    public static int banana(int[] a) {
        int grape = 0;
        int i = 0;
        while (i < a.length) {
            grape = grape + a[i];
            i++;
        }
        return grape;
    }

    public static int apple(int[] a, int p) {
        int i = 0;
        int pear = 0;
        while (i < a.length) {
            if (a[i] == p) {
                pear++;
                i++;
            }
        }
        return pear;
    }

    public static int grapefruit(int[] a, int p) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == p) {
                return i;
            }
        }
        return -1;
    }
}
// EXPLICACIÓN EN ex49.txt
