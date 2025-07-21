// DSA-Java/Strings/CountLowercaseVowels/
// Program: Count how many times lowercase vowels occurred in a string entered by the user

// ✅ Approach:
// - Traverse the string character by character.
// - Check if each character is a lowercase vowel ('a', 'e', 'i', 'o', 'u').
// - Maintain a count and return it.

// ⏱️ Time Complexity: O(n) — where n is the length of the input string
// 📦 Space Complexity: O(1) — constant extra space

import java.util.*;

public class CountLowercaseVowels {

    // Function to count lowercase vowels
    public static int count(String str) {
        int count = 0;

        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            // Check if character is a lowercase vowel
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || 
                str.charAt(i) == 'i' || str.charAt(i) == 'o' || 
                str.charAt(i) == 'u') {
                count++;  // Increment count for each vowel
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: User enters a string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Count and display number of lowercase vowels
        int ct = count(str);
        System.out.println("Number of lowercase vowels: " + ct);
    }
}