// DSA-Java/Strings 01/Pallindrome/
//Approach: check first and last chars and keep on updating if both char are not same then return false
//Time Complexity: O(n^2) Space Complexity: O(1);

public class Pallindrome {
    public static boolean isPallindrome(String str) {
        int n = str.length();
        for(int i =0; i < n/2; i++) {
            if(str.charAt(i) != str.charAt(n-1-i))
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        boolean ans = isPallindrome(str);
        System.out.println(ans);
    }
}