package HeapSort;

public class HeapSort {
    public static void sort(int[] arr) {
        build(arr);
        for (int i = arr.length - 1; i >= 1; --i) {
            swap(arr, 0, i);
            heapify(0, i, arr);
        }
    }

    private static void build(int[] arr) {
        for (int i = arr.length/2 - 1; i >= 0; --i) {
            heapify(i, arr.length, arr);
        }
    }

    private static void heapify(int i, int size, int[] arr) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < size && arr[left] > arr[i]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            heapify(largest, size, arr);
        }
    }


    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}