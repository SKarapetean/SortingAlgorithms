import BubbleSort.BubbleSortGeneric;
import SelectionSort.SelectionSortGeneric;
import SelectionSort.SelectionSort;
import InsertionSort.InsertionSort;
import QuickSort.QuickSortGeneric;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-1,-1,-1,-1,-2,-2,-100000,25, 0, 0,-2,5,5,-3,-2};

        SelectionSortGeneric<Integer> quickSortGeneric = new SelectionSortGeneric<Integer>();
        SelectionSort.sort(arr);
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}