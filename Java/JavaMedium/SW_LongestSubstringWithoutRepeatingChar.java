import java.util.HashMap;

public class SW_LongestSubstringWithoutRepeatingChar {

    /*
     * 4. Longest Substring without Repeating Characters
     * Problem Statement: Find the length of the longest substring without repeating characters.
     * Input: "abcabcbb"
     * Expected Result: 3
     */

    public static void main(String[] args) {
        String str = "abcabcbb";
        HashMap<Character, Integer> hm = new HashMap<>();

        int i = 0;  // Left pointer
        int max = 0;  // Store the maximum length of valid substring

        // Expand the window with the right pointer
        for (int j = 0; j < str.length(); j++) {
            char cj = str.charAt(j);  // Current character at right pointer
            hm.put(cj, hm.getOrDefault(cj, 0) + 1);  // Update the character count

            // If the character count becomes greater than 1, shrink the window
            while (hm.get(cj) > 1) {
                char ci = str.charAt(i);  // Character at left pointer
                hm.put(ci, hm.get(ci) - 1);  // Reduce the count of the character
                if (hm.get(ci) == 0) {
                    hm.remove(ci);  // Remove the character if its count becomes 0
                }
                i++;  // Move the left pointer to the right
            }

            // Update the maximum length after adjusting the window
            max = Math.max(max, j - i + 1);
        }

        System.out.println("The length of the longest substring without repeating characters is: " + max);
    }
}
