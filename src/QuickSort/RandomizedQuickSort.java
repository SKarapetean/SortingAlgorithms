package QuickSort;

import java.util.Random;
public class RandomizedQuickSort {

    public static void sort(int[] arr) {
        quick(arr, 0, arr.length - 1);
    }

    private static void quick(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partitionRight(arr, low, high);
            quick(arr, low, partition - 1);
            quick(arr, partition + 1, high);
        }
    }

    private static int partitionRight(int[] arr, int low, int high) {
        Random rand = new Random();
        int r = low + rand.nextInt(high - low);
        swap(arr, r, high);

        return partitionLeft(arr, low, high);
    }

    private static int partitionLeft(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for (int j = low; j < high; ++j) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                ++i;
            }
        }

        swap(arr, i, high);

        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
