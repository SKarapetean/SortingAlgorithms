# Sorting Algorithms:

This is a Java-based program that implements four different sorting algorithms for both primitive (int) and generic types: bubble sort, selection sort, insertion sort, quick sort, merge sort and heap sort.

## Sorting Algorithms:

### Bubble Sort:

This is a simple sorting algorithm that repeatedly iterates through the list, comparing adjacent elements and swapping them if they are in the wrong order. It has a time complexity of O(n^2).

### Selection Sort:

This is another simple sorting algorithm that repeatedly selects the minimum element from the unsorted portion of the list and swaps it with the first element of the unsorted portion. It has a time complexity of O(n^2).

### Insertion Sort:

This is a sorting algorithm that builds the final sorted list one item at a time. It takes each element and inserts it into the correct position in the sorted portion of the list. It has a time complexity of O(n^2).

### Quick Sort:

This is a divide-and-conquer sorting algorithm that picks an element as a pivot and partitions the array around the pivot. It has a time complexity of O(n^2).

#### Randomized Quick Sort:

Randomized Quick Sort is an efficient sorting algorithm based on the divide-and-conquer paradigm. It randomly selects a pivot element from the array, partitions the array into two segments based on the pivot, and recursively applies the same process to the segments. The randomization of the pivot selection helps mitigate the worst-case scenarios of the traditional Quick Sort, providing an average-case time complexity of O(n log n). It is an in-place sorting algorithm widely used for its performance on average.

### Merge Sort:

This is a divide-and-conquer sorting algorithm that divides the input array into two halves, recursively sorts them, and then merges the two sorted halves. It has a time complexity of O(n log n).

### Heap Sort:

Heap Sort is a comparison-based sorting algorithm that utilizes a binary heap data structure. It builds a max-heap (for ascending order) or a min-heap (for descending order) from the input array and repeatedly extracts the root element, which is the maximum (or minimum) element in the heap. The extracted elements form a sorted sequence. Heap Sort has a time complexity of O(n log n) and is not sensitive to the initial order of elements, making it suitable for various scenarios. It is an in-place sorting algorithm with a space complexity of O(1).


### Customizing:

If you want to customize the Java Sorting Algorithms program, you can modify the existing classes or create new subclasses to implement additional sorting algorithms. You can also modify the SortTester class to test the new algorithms with different input data.

### Requirements:

Java 8 or higher

### Contributing:

If you would like to contribute to the Java Sorting Algorithms project, please fork the repository and submit a pull request with your changes. We welcome contributions of all types, including bug fixes, new features, and improvements to the documentation.
