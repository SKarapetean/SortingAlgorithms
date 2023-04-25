package BubbleSort;

public class BubbleSortGeneric  {

    public static <T extends Comparable<T>> void sort(T[] array) {
        T tmp;
        boolean swapped;
        for (int i = 0; i < array.length - 1; ++i) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; ++j) {
                if (array[j].compareTo(array[j+1]) > 0 ) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }

    }
}
