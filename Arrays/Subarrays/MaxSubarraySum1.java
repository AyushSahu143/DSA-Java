/* DSA/Arrays/Subarrays 01/Max subarray sum I (Brute Force)
 * Description: sum of maximum subarray, using 3 nested loops and Brute force
 * Time Complexity = O(n^3), not good or not preferable at all
 */
public class MaxSubarraySum1 {
    public static void maxSubarraySum(int numbers[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0 ; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                currentSum = 0;  // inside j loop for updating everytime to 0 after every subarray
                for(int k = i; k <= j; k++) {
                    currentSum += numbers[k]; // adding elements of subarrays
                }
                System.out.println(currentSum);
                if(maxSum < currentSum) {
                    maxSum = currentSum; // updating maximum sum variable if found less than current sum
                }
            }
        }
        System.out.println("Max sum of Subarray is: "+maxSum);  //printing
    }
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        maxSubarraySum(numbers);
    }
    
}