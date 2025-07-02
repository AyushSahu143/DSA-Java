/* DSA//Arrays//Searching 02/
 * LeetCode 33 - Search in Rotated Sorted Array
 * Problem Link: https://leetcode.com/problems/search-in-rotated-sorted-array/description/
 * Difficulty: Medium
 * Tags: Array, Binary Search
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Use modified binary search.
 * - Check if left or right half is sorted.
 * - Narrow down the search space accordingly.
 */
 
public class SearchInRotatedSortedArray {
    public static int search(int nums[], int target) {
        int n = nums.length;
        int low = 0, high = n-1;
        while (low <= high) {
            int mid =(low+high)/2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] >= nums[low]) {  // left side of array is sorted
                if(target >= nums[low] && target < nums[mid]) { // element is in the left/sorted side
                    high = mid - 1;
                } else {  // element is in the right/unsorted side
                    low = mid + 1;
                }  
            }
            else { // right sid eof array is sorted 
                if(target > nums[mid] && target <= nums[high]) {  // element is in the right/sorted side
                    low = mid + 1;
                } else {    // element is in the left/unsorted side
                    high = mid - 1;
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {6, 7, 8, 9, 1, 2, 3, 4, 5};
        int target = 4;
       int ans = search(nums, target);
       System.out.println("Target indexed at: "+ans);

        
    }
}
