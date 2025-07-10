public class SpiralMatrix {

    public static void spiral(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int sRow = 0;
        int scol = 0;
        int eRow = n-1;
        int ecol = m-1;
        
        while(sRow <= eRow && scol <= ecol) {
            //top
            for(int j = scol; j <= ecol; j++) {
                System.out.print(matrix[sRow][j]+" ");
            }

            //right
            for(int i = sRow+1; i <= eRow; i++) {
                System.out.print(matrix[i][ecol]+" ");
            }
            //bottom
            for(int j = ecol-1; j >= scol; j--) {
                System.out.print(matrix[eRow][j]+" ");
            }
            //left
            for(int i = eRow-1; i >= sRow+1; i--) {
                System.out.print(matrix[i][scol]+" ");
            }
            sRow++;
            scol++;
            eRow--;
            ecol--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        spiral(matrix);

    }
}