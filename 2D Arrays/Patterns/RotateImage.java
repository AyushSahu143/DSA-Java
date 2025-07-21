/** DSA-Java/2D Arrays/Patterns/RotateImage
 * 🔄 Rotate Image 90 Degrees Clockwise (LeetCode 48)
 * Problem link: https://leetcode.com/problems/rotate-image/
 * 
 * Given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise) in-place.
 *
 * Approach:
 * 1. Transpose the matrix (convert rows to columns).
 * 2. Reverse each row of the transposed matrix.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1) - In-place rotation

 */

public class RotateImage {

    // 🔁 Function to rotate the matrix 90 degrees clockwise
    public static void rotate90(int[][] mat) {
        // 🔄 Step 1: Transpose the matrix
        for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat[0].length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // ↔️ Step 2: Reverse each row
        for (int i = 0; i < mat.length; i++) {
            reverse(mat[i]);
        }
    }

    // 🔁 Helper function to reverse a 1D array (used to reverse each row)
    public static void reverse(int[] row) {
        int start = 0;
        int end = row.length - 1;
        while (start < end) {
            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;
            start++;
            end--;
        }
    }

    // 🖨️ Function to print the 2D matrix
    public static void print(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 🚀 Main method to test the rotation
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotate90(mat);  // Perform rotation
        print(mat);     // Print the rotated matrix
    }
}