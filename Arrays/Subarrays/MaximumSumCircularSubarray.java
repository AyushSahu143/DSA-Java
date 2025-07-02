/*
 * LeetCode 918: Maximum Sum Circular Subarray
 * Problem link: https://leetcode.com/problems/maximum-sum-circular-subarray/
 * Approach: Kadane’s Algorithm (normal + circular case)
 * - Case 1: Normal max subarray using Kadane's
 * - Case 2: Circular max = total sum - min subarray sum
 * Edge Case: If all elements are negative, return maxKadane
 * Time Complexity: O(n), Space: O(1)
 */

public class MaximumSumCircularSubarray {
     public static int kadaneMax(int nums[]) {
        //calculating normal max subarray sum
         int maxSum = nums[0];
        int currSum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum+nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    public static int kadaneMin(int nums[]) {
        // calculating normal min subarray sum
         int minSum = nums[0];
        int currSum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            currSum = Math.min(nums[i], currSum+nums[i]);
            minSum = Math.min(minSum, currSum);
        }
         return minSum;
    }
    public static int totalSum(int nums[]) {
        // caluculating total sum of array elements
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
    public static int maxSubarraySumCircular(int[] nums) {
        //Calculating circular sum = totalSum - minSum
        int maxSum;
        int totalSum = totalSum(nums);
        int kadanesmax = kadaneMax(nums);
        int kadanesmin = kadaneMin(nums);
        int cirSum = totalSum - kadanesmin;
        if(kadanesmax > 0) { // checking if max is greater than zero or not to avoid wrong answer
            kadanesmax = Math.max(cirSum, kadanesmax);
        } 
        return kadanesmax;
    }
    public static void main(String[] args) {
        int nums[] = {5, -3, 5};
        System.out.println("Max sum: "+maxSubarraySumCircular(nums));
    }
}
