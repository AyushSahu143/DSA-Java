/*
DSA/Sorting and Searching/Basic Sorting 01/BubbleSort

Approach:
- Repeatedly swap adjacent elements if they are in the wrong order.
- Outer loop controls the number of passes (turns).
- Inner loop compares adjacent elements and swaps if needed.
- Optimization: Stop early if no swaps happen in a pass.

Time Complexity: O(n^2) in worst/average case, O(n) in best case (already sorted)
Space Complexity: O(1) — sorting is done in-place
*/

public class BubbleSort {

    // Function to perform Bubble Sort on the array
    public static void bubbleSort(int arr[]) {
        int n = arr.length;

        // Outer loop: each pass brings the largest unsorted element to its correct position
        for (int turn = 0; turn < n - 1; turn++) {
            int swap = 0; // Counter to track number of swaps in this pass

            // Inner loop: compare adjacent elements and swap if out of order
            for (int j = 0; j < n - 1 - turn; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }

            // Print how many swaps occurred in this turn (optional for learning/debugging)
            System.out.println("Swaps in turn " + turn + ": " + swap);

            // If no swaps happened, array is already sorted — break early
            if (swap == 0) break;
        }
    }

    // Function to print the sorted array
    public static void printSortedArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main method to run and test the sorting function
    public static void main(String[] args) {
        int arr[] = {5, 4, 2, 1, 3}; // Sample unsorted array

        bubbleSort(arr); // Perform Bubble Sort
        printSortedArray(arr); // Print the sorted array
    }
}