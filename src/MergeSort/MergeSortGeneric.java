package MergeSort;

public class MergeSortGeneric {

    public static <T extends Comparable<T>> void sort(T[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private static <T extends Comparable<T>> void mergeSort(T[] array, int start, int end){
        int mid = (start + end) / 2;
        if (start < end) {
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }

    private static <T extends Comparable<T>>void merge(T[] array, int start, int mid, int end) {
        int leftSize = mid - start + 1;
        int rightSize = end - mid;
        T[] left = (T[]) new Comparable[leftSize];
        T[] right = (T[]) new Comparable[rightSize];
        int i = 0, j = 0;
        int k = start;
        System.arraycopy(array, start, left, 0, leftSize);
        System.arraycopy(array, mid + 1, right, 0, rightSize);

        while (i < leftSize && j < rightSize) {
            if (left[i].compareTo(right[j]) <= 0) {
                array[k] = left[i];
                ++i;
            } else {
                array[k] = right[j];
                ++j;
            }
            ++k;
        }

        while (i < leftSize) {
            array[k] = left[i];
            ++i;
            ++k;
        }

        while (j < rightSize) {
            array[k] = right[j];
            ++j;
            ++k;
        }
    }
}
