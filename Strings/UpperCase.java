//DSA-Java/Strings/UpperCase/
// Program: Capitalize the First Letter of Each Word in a String
// Approach: 
//   1. Convert the entire string to lowercase.
//   2. Capitalize the first character.
//   3. Then, loop through the rest of the string.
//      - If a space is found, capitalize the next character.
//      - Append characters to a StringBuilder.
// Time Complexity: O(n), where n is the length of the input string
// Space Complexity: O(n), for storing the result string

public class UpperCase {

    // Function to capitalize the first letter of every word
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder();

        // Convert to lowercase first to ensure clean capitalization
        str = str.toLowerCase();

        // Capitalize the first character
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // Loop through the string starting from index 1
        for (int i = 1; i < str.length(); i++) {
            // If current character is a space and there's another character after it
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(' ');  // Add the space
                i++;  // Move to the next character after space
                sb.append(Character.toUpperCase(str.charAt(i)));  // Capitalize it
            } else {
                sb.append(str.charAt(i));  // Add character as-is
            }
        }

        return sb.toString();  // Return the result string
    }

    public static void main(String[] args) {
        String str = "hi, i am rOBOT";
        String newStr = toUpperCase(str);
        System.out.println(newStr);  // Output: Hi, I Am Robot
    }
}