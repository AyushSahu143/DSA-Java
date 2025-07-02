/* DSA//Arrays//Basics 1//Linear Search
 * Description: finding an element in array by traversing the whole array through elements one by one 
 * Time complexity = O(n)
 */
public class LinearSearch {

    public static int LinearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
        int key = 10;

        int index = LinearSearch(arr, key);

        if(index == -1) {
            System.out.println("NOT FOUND!");
        } else {
            System.out.println("key is at index: "+index );
        }
    }
}