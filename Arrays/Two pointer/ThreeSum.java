/**    DSA-Java/Arrays/Two Pointer/
 *     Problem link: https://leetcode.com/problems/3sum/
     * Function: threeSum
     * ------------------
     * Returns any one triplet from the array that sums to 0.
     * Uses the two-pointer technique after sorting the array.
     * 
     * Note: This version returns only one valid triplet.
     *       For returning all unique triplets, use a List<List<Integer>>.
     *
     * Time Complexity: O(n^2)
     * Space Complexity: O(1) (excluding sorting)
     */

import java.util.Arrays;

public class ThreeSum {
    public static int[] threeSum(int[] nums) {
        int n = nums.length;

        // Step 1: Sort the array to use two-pointer approach
        Arrays.sort(nums);

        // Step 2: Loop through each element and apply two-pointer technique
        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate values for the current index to avoid repeated triplets
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            // Step 3: Two-pointer search for remaining two values
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Found a valid triplet that sums to 0
                    return new int[] { nums[i], nums[left], nums[right] };
                } else if (sum < 0) {
                    // Sum is too small, move left pointer to increase it
                    left++;
                } else {
                    // Sum is too large, move right pointer to decrease it
                    right--;
                }
            }
        }

        // No valid triplet found
        return new int[] {};
    }

    /**
     * Main Method
     * -----------
     * Entry point to test the threeSum function with a sample input.
     */
    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        
        // Print the resulting triplet, if any
        System.out.print(Arrays.toString(threeSum(nums)));
        System.out.println();
    }
}