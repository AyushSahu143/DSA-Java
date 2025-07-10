public class InsertionSort {
    public static void insertion(int arr[]) {
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j > 0; j--) {
                if(arr[j-1] > arr[j]) {
                  int temp = arr[j-1];
                  arr[j-1] = arr[j];
                  arr[j] = temp;  
                } else {
                    break;
                }
            }
        }
    }
    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        insertion(arr);
        printArray(arr);
    }
}
