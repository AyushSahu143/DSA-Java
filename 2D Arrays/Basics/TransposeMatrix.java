public class TransposeMatrix {
   public static int[][] transpose(int[][] mat) {
    int rows = mat.length;
    int cols = mat[0].length;
    int[][] result = new int[cols][rows];

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            result[j][i] = mat[i][j];
        }
    }
    return result;
}

    public static void main(String[] args) {
        int mat[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
         int trans[][] = transpose(mat);
          for (int i = 0; i < trans.length; i++) {
        for (int j = 0; j < trans[0].length; j++) {
            System.out.print(trans[i][j]+" ");
        }
        System.out.println();
    }
        
    }
}
