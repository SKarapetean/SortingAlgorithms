package SelectionSort;

public class SelectionSortGeneric <T extends Comparable<T>>{

    public void sort(T[] array) {
        int minIndex = 0;
        T tmp;
        for (int i = 0; i < array.length; ++i) {
            minIndex = i;
            for (int j = minIndex + 1; j < array.length; ++j) {
                if (array[minIndex].compareTo(array[j]) > 0) {
                    minIndex = j;
                }
            }
            tmp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = tmp;
        }
    }
}
