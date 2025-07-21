// DSA-Java/Strings/Anagrams/
// Program: Check if two strings are anagrams of each other
// 
// ✅ Approach:
//   - Convert both strings to lowercase (for case-insensitive comparison)
//   - Convert each to a character array
//   - Sort both arrays
//   - Compare sorted arrays using Arrays.equals()
// 
// ⏱️ Time Complexity: O(n log n) — due to sorting
// 📦 Space Complexity: O(n) — for storing character arrays

import java.util.Arrays;

public class Anagrams {

    // Function to check if two strings are anagrams
    public static boolean anagram(String s1, String s2) {
        // Handle null cases (optional, interview-safe)
        if (s1 == null || s2 == null) {
            return false;
        }

        // If lengths don't match, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert to lowercase to ensure case-insensitive comparison
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Convert strings to character arrays
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        // Sort both arrays
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // Compare sorted arrays
        return Arrays.equals(ch1, ch2);
    }

    public static void main(String[] args) {
        // Sample input strings
        String s1 = "Dog";
        String s2 = "God";

        // Output the result
        System.out.println(anagram(s1, s2));  // Output: true
    }
}