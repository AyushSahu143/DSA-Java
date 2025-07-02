/* DSA/Arrays/Basics 04/Pairs in array
 * Description: finding total number of unique pairs of elements in array, using nested loops
 * Time Complexity = O(n^2)
 * total number of unique pairs = (n*(n-1))/2
 */
public class PairsInArray {
    public static void printPairs(int num[]) {
        int curr; // tracks current element or left part of pair
        int tp = 0; // counts total no of unique pairs in array
        System.out.println("Pairs are:");
        for (int i = 0; i < num.length; i++) {
            curr = num[i]; // assigned the value of first element initially
            for (int j = i + 1; j < num.length; j++) { // j = i+1 means right part of pair, taken after left part
                System.out.print("(" + curr + "," + num[j] + ")");
                tp++; // counter gets++ for every pair
            }
            System.out.println();

        }
        System.out.println("Total pairs are: " + tp);
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };

        printPairs(num);
    }
}
