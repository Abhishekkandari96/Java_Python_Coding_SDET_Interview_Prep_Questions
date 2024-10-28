
import java.util.HashMap;

public class SW_longestSubstringWithKChar {
    /*
     * 3. Longest Substring with K Distinct Characters
Problem Statement: Find the length of the longest substring with exactly K distinct characters.
Input: "araaci", K = 2
Expected Result: 4
     */

     public static void main(String[] args) {
        String str="araaci";
        HashMap<Character,Integer> hm=new HashMap<>();

        int i=0;
        int j=0;
        int k=2;
        int max=0;
        while(j<str.length()){
            char currentJchar=str.charAt(j);
            hm.put(currentJchar, hm.getOrDefault(currentJchar, 0)+1);

            while (hm.size() > k) {
                char currentIchar = str.charAt(i);
                hm.put(currentIchar, hm.get(currentIchar) - 1);

                if (hm.get(currentIchar) == 0) {
                    hm.remove(currentIchar);  // Remove the character completely if frequency becomes 0
                }
                i++;  // Move the left pointer to the right
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        System.out.println(max);

     }
    
}
