package fastrack.com.Extramile;

public class Main {
    public static void main(String[] args) {
        int[] array = {19, 62, 2, 28, 5, 9, 7, 11, 8};
        ex1(array, 16);
        ex2(array, 18);
    }

    public static void ex1(int[] array, int target) {
        boolean pair = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println(array[i] + " + " + array[j] + " = " + target);
                    pair = true;
                }
            }
        }
        if (!pair) System.out.println("No pair found");
    }

    public static void ex2(int[] array, int target) {
        boolean triplets = false;
        for (int i = 0; i < array.length; i++) {
            for (int t = i + 1; t < array.length; t++) {
                for (int j = t + 1; j < array.length; j++) {
                    if (array[i] + array[t] + array[j] == target) {
                        System.out.println(array[i] + " + " + array[t] + " + " + array[j] + " = " + target);
                        triplets = true;
                    }
                }
            }
        }
        if (!triplets) System.out.println("No triplet found");
    }
}
