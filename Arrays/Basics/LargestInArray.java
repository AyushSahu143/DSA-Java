
/* DSA//Arrays//Basics 2//Largest in Array
Description: Searching for largest and smallest element in array
Time Com[lexity = O(n) */
import java.util.*;

public class LargestInArray {
    public static int getLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest element in array: " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 4, 10, 8 };
        int largest = getLargest(arr);
        System.out.println("Largest element in array: " + largest);
    }
}
