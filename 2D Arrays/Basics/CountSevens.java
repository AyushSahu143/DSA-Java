// ✅ CountSevens.java
// 👉 Problem: Count how many times the number 7 appears in a 2D array
// 📌 Approach: Traverse the matrix using nested loops and count occurrences of 7
// ⏱ Time Complexity: O(n × m) — every element is checked once
// 🧠 Space Complexity: O(1) — only a counter is used

public class CountSevens {

    // Method to count how many times the number 7 appears in the matrix
    public static int countSevens(int[][] mat) {
        int n = mat.length;         // Number of rows
        int m = mat[0].length;      // Number of columns
        int count = 0;              // Counter for number of 7s

        // Traverse each cell of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 7) {
                    count++;        // Increment count when 7 is found
                }
            }
        }

        return count;               // Return total count of 7s
    }

    public static void main(String[] args) {
        // Sample matrix
        int[][] mat = {
            {4, 7, 8},
            {8, 8, 7}
        };

        // Call the function and print result
        int count = countSevens(mat);
        System.out.println("Count of sevens: " + count);
    }
}