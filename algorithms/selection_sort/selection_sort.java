package algorithms.selection_sort;

public class selection_sort {

    public int[] selectionSort(int[] arr) {

        int i = 0;

        while (i < arr.length - 1) {

            int smallestNumberIndex = i;

            for (int j = i + 1; j < arr.length; i++) {

                if (arr[j] < arr[smallestNumberIndex]) {
                    smallestNumberIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[smallestNumberIndex];
            arr[smallestNumberIndex] = temp;

            i++;

        }
        return arr;

    }

    public int[] anotherImplementation(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int smallestNumberIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallestNumberIndex]) {
                    smallestNumberIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[smallestNumberIndex];
            arr[smallestNumberIndex] = temp;
        }

        return arr;
    }

    // The outer loop iterates over each element of the array except the last one
    // (since the last element will be naturally sorted by the time all others are
    // sorted).

    // The inner loop finds the index of the smallest element in the unsorted part
    // of the array.

    // The smallest element found is then swapped with the first unsorted element.

    // The sorting is done in-place, meaning the original array arr is sorted
    // without the need for an additional array.

}
