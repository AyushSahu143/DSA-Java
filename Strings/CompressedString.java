//DSA-Java/Strings/CompressedStrings/
// Program: Compress a String by Replacing Consecutive Repeating Characters with Their Count
// Approach:
//   1. Use a loop to traverse each character in the string.
//   2. Count how many times a character repeats consecutively.
//   3. Append the character once and the count (if > 1) to the result.
//   4. Use a StringBuilder to efficiently build the new string.
// Time Complexity: O(n), where n is the length of the input string
// Space Complexity: O(n), for storing the compressed result string

public class CompressedString {

    // Function to compress a string using counts of repeated characters
    public static String compress(String str) {
        StringBuilder s = new StringBuilder();

        // Traverse the string
        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            // Count consecutive repetitions of current character
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // Append the character
            s.append(str.charAt(i));

            // Append count if more than 1
            if (count > 1) {
                s.append(count);
            }
        }

        return s.toString();  // Return the compressed string
    }

    public static void main(String[] args) {
        String str = "aaaabbbccd";
        String newStr = compress(str);
        System.out.println(newStr);  // Output: a4b3c2d
    }
}