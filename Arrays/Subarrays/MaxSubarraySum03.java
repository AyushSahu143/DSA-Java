/* DSA/Arrays/Subarrays 03/
 * LeetCode 53: Maximum Subarray
 * problem link: https://leetcode.com/problems/maximum-subarray/ 
 * Approach: Kadane’s Algorithm (Greedy)
 * Track max subarray sum ending at each index.
 * 
 * Time: O(n), Space: O(1)
 * 
 * Example: [-2,1,-3,4,-1,2,1,-5,4] → Output: 6
 */
public class MaxSubarraySum03 {
    public static int maxSubarraySum(int nums[]) {
        int n = nums.length;
        int currentSum = nums[0];
        int maxSum = nums[0];
       for(int i = 1; i < n; i++) {
            currentSum = Math.max(nums[i], currentSum+nums[i]); // deciding if the elements are -ve or +ve
            maxSum = Math.max(maxSum, currentSum); // deciding, whether to update maxSum or not
       }
       return maxSum;
    }
    public static void main(String[] args) {
        int nums[] = {-4, -3, -2, -1, -4, -5, -6};  // all elements are negative
        int ans = maxSubarraySum(nums);
        System.out.println(ans);
    }
}
