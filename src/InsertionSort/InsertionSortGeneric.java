package InsertionSort;

public class InsertionSortGeneric <T extends Comparable<T>>{

    public void sort(T[] array) {
        T key;
        int j;
        for (int i = 0; i < array.length; ++i) {
            key = array[i];
            j = i - 1;
            while (j >= 0 && key.compareTo(array[j]) < 0) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }
}
