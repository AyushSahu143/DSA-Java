// ✅ SecondRowSum.java
// 👉 Problem: Find the sum of the second row in a 2D matrix
// 📌 Approach: Directly access the second row using mat[1][j] and sum its elements
// ⏱ Time Complexity: O(m), where m is the number of columns
// 🧠 Space Complexity: O(1), using a single variable for sum

public class SecondRowSum {

    // Method to calculate the sum of the second row
    public static int sumRow(int[][] mat) {
        // Edge case: matrix has less than 2 rows
        if (mat.length < 2) {
            return 0;
        }

        int sum = 0;
        // Traverse the second row (index 1)
        for (int j = 0; j < mat[0].length; j++) {
            sum += mat[1][j];
        }

        return sum;
    }

    public static void main(String[] args) {
        // Sample 2D matrix
        int mat[][] = {
            {1, 4, 9},
            {11, 4, 3},
            {2, 2, 3}
        };

        // Output the sum of the second row
        System.out.println("Sum of second row of array: " + sumRow(mat));
    }
}