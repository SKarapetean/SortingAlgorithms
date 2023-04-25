package HeapSort;

public class HeapSort {

    public static void heapify(int[] arr, int size, int n) {
        int r = size-1;
        while (n >= 0) {
            int i = r - n*2;
            while (i >= 0) {
                if (arr[n] < arr[r]) {
                    int tmp = arr[n];
                    arr[n] = arr[r];
                    arr[r] = tmp;
                }
                --i;
                --r;
            }
            --n;
        }
    }

    public static void sort(int[] arr) {
        int n = arr.length/2 - 1;
        int size = arr.length;
        while (size > 0) {
            heapify(arr,size, n);
            int tmp = arr[0];
            arr[0] = arr[size - 1];
            arr[size - 1] = tmp;
            --size;
            n = size/2 - 1;
        }
    }

}