public class SearchingInSortedMatrix {
    public static boolean staircaseSearching(int[][] mat, int key) {
        int n = mat.length, m = mat[0].length;
        int row = 0, col = m-1;
        while(row < n && col >= 0) {
            if(mat[row][col] == key) {
                System.out.println("key found at ("+row+", "+col+")");
                return true;
            }
            else if(key > mat[row][col]) {
                row++;
            }
            else if(key < mat[row][col]){
                col--;
            }
        }
         System.out.println("Key not found!");
            return false;
    }

    public static void main(String[] args) {
        int mat[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int key = 39;
        staircaseSearching(mat, key);
        
    }
}