package algorithms.binary_search;

public class binary_search {

    int binarySearch(int[] list, int item) {

        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int midPoint = low + (high - low) / 2; // To prevent potential overflow.

            int guess = list[midPoint];

            if (guess == item) {
                return midPoint; // Return the index where the item is found.
            }

            if (guess < item) { // If the guess is less than the item,
                low = midPoint + 1; // set low to one after the midpoint.
            } else { // If the guess is greater than the item,
                high = midPoint - 1; // set high to one before the midpoint.
            }
        }

        return -1; // Return -1 if the item is not found.
    }

}
