import java.util.*;
public class LargestElement {
    public static int largest(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int large = Integer.MIN_VALUE;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
               large = Math.max(large, matrix[i][j]);
            }
        }
        return large;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 3, n = 3;
        int matrix[][] = new int[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int ans = largest(matrix);
        System.out.println("Largest element in array is: "+ans);
        sc.close();
    }
}