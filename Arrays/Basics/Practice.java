/* DSA/Arrays/Basics
NOTE: IGNORE THIS FILE!!!
 * Description: This file is solely for practice of any question of array, could be ignorable
 * 1) leetcode: 169 Majority element
 * 2) leetcode: 2965 fiind missing and repeated values
 * 3) leetcode 918: max sum of circular subarray
 */

public class Practice {
    public static int maxCircularSum(int nums[]) {
        // int n = nums.length;
        // int count;

        // for(int i = 0; i < n; i++) {
        //     count = 0;
        //     for(int j = 0; j < n; j++) {
        //         if(nums[i] == nums[j]) {
        //             count++;
        //         }
        //     }
        //     if(count > (n/2)) {
        //         return nums[i];
        //     }
        // }
        // return -1;
        int maxSum = nums[0];
        int currSum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum+nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;

    }
    public static void main(String[] args) {
    //     int arr[] = {2, 2, 2, 1, 1, 2};
    //    int ans = frequency(arr);
    //    System.out.println(ans);
    }

}
