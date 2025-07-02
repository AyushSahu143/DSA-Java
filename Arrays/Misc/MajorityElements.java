/* DSA//Arrays//Misc/
 * LeetCode 169 - Majority Element
 * Problem Link: https://leetcode.com/problems/majority-element/
 * Difficulty: Easy
 * Tags: Array, Brute Force
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 * 
 * Approach:
 * - For each element in the array, count its total occurrences.
 * - If its frequency exceeds n / 2, return that element.
 * - Otherwise, continue checking remaining elements.
 */
public class MajorityElements {
public static int frequency(int nums[]) {
        int n = nums.length;
        int count;

        for(int i = 0; i < n; i++) { // tracking a single element
            count = 0;
            for(int j = 0; j < n; j++) {  // tracking its copies
                if(nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count > (n/2)) {  // condition for majority element
                return nums[i];
            }
        }
        return -1;  // in case of no such element is found
    }
    public static void main(String[] args) {
        int arr[] = {2, 2, 2, 1, 1, 2};
       int ans = frequency(arr);
       System.out.println(ans);
    }
}