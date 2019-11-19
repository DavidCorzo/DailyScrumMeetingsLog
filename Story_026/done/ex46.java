/**
 * ex46
 */
public class ex46 {
    // a diagram consisting of rectangles whose area is proportional to the
    // frequency of a variable and whose width is equal to the class interval.
    public static int[] makeHist(int[] scores) {
        int[] histograma = new int[10];
        for (int i = 0; i < scores.length; i++) {
            int index = scores[i] / 10;
            histograma[index]++;
        }
        return histograma;

    }

    public static void main(String[] args) {
        int[] scores = new int[] { 12, 32, 45, 67, 89, 10, 11 };
        int[] hist = makeHist(scores);
        for (int i = 1; i < hist.length; i++) {
            System.out.println(/* "In histogram: " + */ hist[i]);
            // System.out.println(/* "In Scores array: " + */ scores[i]);
        }

    }
}
