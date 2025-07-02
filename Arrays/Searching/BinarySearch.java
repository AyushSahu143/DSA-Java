/* DSA//Arrays//Searching 01/
 * LeetCode 704 - Binary Search
 * Problem Link: https://leetcode.com/problems/binary-search/
 * Difficulty: Easy
 * Tags: Binary Search, Array
 * 
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 * 
 * Approach:
 * - Apply classic binary search on a sorted array.
 * - Compare target with middle element to shrink search space.
 */
 

public class BinarySearch {
    public static int binarySearching(int sortedArray[], int target) {
        int start = 0;
        int end = sortedArray.length - 1;

        while (start <= end) {
            int mid = start + (end-start)/2; //avoid overflow
            //in case of target found at mid
            if (sortedArray[mid] == target) {
                return mid;
                // in case of target is on the right side or greater than mid
            } else if (sortedArray[mid] < target) {
                start = mid+1;
                //in case of targert is on the left sid or less than mid
            } else {
                end = mid-1;
            }
        }
        return -1;  //in case of element not found

    }

    public static void main(String[] args) {
        int sortedArray[] = {2, 4, 8, 10, 12, 14};
        int target = 4;
        int found = binarySearching(sortedArray, target);
        if(found == -1)  {
             System.out.println("NOT FOUND!");
        } else {
            System.out.println("Target element found at index: "+found);
        }
       
    }
}