public class FrequencyOfElements {
    public static boolean check(int arr[]) {
        int n = arr.length;
        int count;

        for(int i = 0; i < n; i++) {
            count = 0;
            for(int j = i; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count >= 2) {
                System.out.println("Element occuring more than once is: "+arr[i]);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {7, 3, 9, 5, 7, 12};
        boolean answer = check(arr);
        System.out.println(answer);
    }
}
