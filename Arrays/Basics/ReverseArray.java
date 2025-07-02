/* DSA/Arrays/Basics 03/Reverse an Array
 * Description: reversing an array just like we reverse a string by going to start and end index and swapping them using 3 variables
 * Time Complexity = O(n),  Space complexity = O(1) (constant)
 */
import java.util.*;

public class ReverseArray {
    public static void reverse(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            //swapping array elements just like we swap variables
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            //updating first and last index to swap new values
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };

        reverse(arr);  //Call by refernce
        System.out.print("reversed array: \n");
        //printing every element of reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
