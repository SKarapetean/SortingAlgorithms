package SelectionSort;

public class SelectionSort {

    public static void sort(int[] array) {
        int minIndex = 0;
        int tmp;
        for (int i = 0; i < array.length; ++i) {
            minIndex = i;
            for (int j = minIndex + 1; j < array.length; ++j) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            tmp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = tmp;
        }
    }
}
