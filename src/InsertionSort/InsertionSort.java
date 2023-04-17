package InsertionSort;

public class InsertionSort {

    public static void sort(int[] array) {
        int key;
        int j = 0;
        for (int i = 0; i < array.length; ++i) {
            j = i - 1;
            key = array[i];
            while (j >= 0 && key < array[j]){
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }

}
