/*  DSA/2D Arrays/Patterns/Diagonal sum
 *     This program calculates the sum of the primary and secondary diagonals 
 *     of a square matrix. It avoids double-counting the center element 
 *     in the case of matrices with odd dimensions.
 * 
 * Problem link: https://leetcode.com/problems/matrix-diagonal-sum/
 *
 * Approach:
 *     - Loop through each row (i from 0 to n-1)
 *     - Add matrix[i][i] → Primary diagonal
 *     - Add matrix[i][n-i-1] → Secondary diagonal
 *     - If i == n-i-1 (center element in odd n), skip adding it twice
 *
 * Time Complexity: O(n)
 *     - We iterate once through the matrix rows.
 *
 * Space Complexity: O(1)
 *     - Only a constant number of extra variables used.
 */

public class DiagonalSum {

    // Method to calculate diagonal sum of a square matrix
    public static int diagonalSum(int[][] matrix) {
        int n = matrix.length;  // Number of rows (and columns)
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // Add primary diagonal element
            sum += matrix[i][i];

            // Add secondary diagonal element, avoid double-counting the center
            if (i != n - i - 1) {
                sum += matrix[i][n - i - 1];
            }
        }

        return sum;
    }

    // Main method to test the diagonal sum function
    public static void main(String[] args) {
        // Sample 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = diagonalSum(matrix);
        System.out.println("Diagonal sum: " + sum);
    }
}