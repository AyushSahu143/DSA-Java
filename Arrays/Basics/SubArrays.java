/* DSA/Arrays/Basics 05/Printing Subarrays
 * Description: printing total subarrays of an array using nested loops and two pointers approach
 * Time Complexity = 0(n^3)
 * total no. of subArrays = (n*(n+1))/2
 */

public class SubArrays {
    public static void printSubArrays(int arr[]) {
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;

                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                System.out.println();
                counter++;
            }
            System.out.println();
        }
        System.out.println("Total number of sub arrays is: " + counter);
        System.out.println("Sum of all subarrays: " + sum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printSubArrays(arr);
    }

}