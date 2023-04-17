package BubbleSort;

public class BubbleSort {

    public static void sort(int[] array) {
        int  tmp;
        boolean swapped = false;
        for (int i = 0; i < array.length - 1; ++i) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; ++j) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
