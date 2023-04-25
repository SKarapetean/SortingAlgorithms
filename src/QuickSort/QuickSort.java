package QuickSort;
import java.util.Arrays;
public class QuickSort {

    public static int[] sortVersion1(int[] array) {
        return quickSortVersion1(array, array.length);
    }

    private static int[] quickSortVersion1(int[] array, int elements) {
        if (elements < 2) {
            return array;
        }

        int currentPosition = 0;
        int tmp = 0;

        for (int i = 1; i < elements; ++i) {
            if (array[i] <= array[0]) {
                ++currentPosition;
                tmp = array[i];
                array[i] = array[currentPosition];
                array[currentPosition] = tmp;
            }
        }

        tmp = array[currentPosition];
        array[currentPosition] = array[0];
        array[0] = tmp;
        int[] left = quickSortVersion1(array,currentPosition);
        int[] tmpArray = Arrays.copyOfRange(array, currentPosition + 1, elements);
        int[] right = quickSortVersion1(tmpArray,elements - currentPosition - 1);
        int[] finalArray = new int[elements];

        for (int i = 0; i < currentPosition; ++i) {
            finalArray[i] = left[i];
        }

        finalArray[currentPosition] = array[currentPosition];

        for (int i = currentPosition + 1; i < elements; ++i) {
            finalArray[i] = right[i - currentPosition - 1];
        }

        return finalArray;
    }

    public static void sortVersion2(int[] array) {
        quickSortVersion2(array, 0, array.length - 1);
    }

    private static void quickSortVersion2(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array,left,right);
            quickSortVersion2(array,left,pivotIndex - 1);
            quickSortVersion2(array, pivotIndex + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;

        for (int j = left; j < right; ++j) {
            if (array[j] < pivot) {
                ++i;
                swap(array,i,j);
            }
        }

        swap(array, i + 1, right);
        return i + 1;
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
