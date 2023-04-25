package MergeSort;

public class MergeSort {

    public static void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int start, int end) {
        int mid = (end + start) / 2;
        if (start < end)  {
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }
    private static void merge(int[] array, int start, int mid,int end) {
        int leftSize = mid - start + 1;
        int rightSize = end - mid;
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        for (int i = 0; i < leftSize; ++i) {
            left[i] = array[start + i];
        }
        for (int i = 0; i < rightSize; ++i) {
            right[i] = array[mid + i + 1];
        }

        int leftIndex = 0;
        int rightIndex = 0;
        for (int k = start; k <= end; ++k) {
            if (leftIndex < leftSize && rightIndex < rightSize) {
                if (left[leftIndex] < right[rightIndex]) {
                    array[k] = left[leftIndex];
                    ++leftIndex;
                } else {
                    array[k] = right[rightIndex];
                    ++rightIndex;
                }
            } else if (leftIndex >= leftSize) {
                array[k] = right[rightIndex];
                ++rightIndex;
            } else {
                array[k] = left[leftIndex];
                ++leftIndex;
            }
        }
    }
}

