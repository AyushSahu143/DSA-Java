/* DSA/Arrays/Misc/TrappingRainWater/
 * LeetCode 42: Trapping Rain Water
 * Problem link: https://leetcode.com/problems/trapping-rain-water/
 * Approach: Prefix Arrays (Left Max Bound & Right Max Bound)
 * - For each index, find the minimum of max height on left and right
 * - Water trapped = min(leftMax, rightMax) - height[i]
 * Time Complexity: O(n)
 * Space Complexity: O(n) for prefix arrays
 */
public class TrappingRainWater {
    public static int trappingRainWater(int height[]) {
        // Array to store max height to the left of each bar
        int leftMaxBound[] = new int[height.length];
        leftMaxBound[0] = height[0]; 
        int trappedWater = 0;

        // Fill leftMaxBound array
        for(int i=1; i<height.length; i++) {
            leftMaxBound[i] = Math.max(leftMaxBound[i-1], height[i]);
        }

        // Array to store max height to the right of each bar
        int rightMaxBound[] = new int[height.length];
        rightMaxBound[height.length-1] = height[height.length-1];

        // Fill rightMaxBound array
        for(int i = height.length-2; i >= 0; i--) {
            rightMaxBound[i] = Math.max(rightMaxBound[i+1], height[i]);
        }

        // Calculate trapped water at each index
        for(int i = 0; i < height.length; i++) {
            int waterHeight = Math.min(leftMaxBound[i], rightMaxBound[i]);
            trappedWater += (waterHeight - height[i]);
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 3, 6, 2, 5};
        System.out.println("Trapped Rainwater: "+trappingRainWater(height));
    }
}