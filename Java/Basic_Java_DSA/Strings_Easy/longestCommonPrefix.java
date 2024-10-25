
/*
Longest Common Prefix
Problem Statement: Given an array of strings, find the longest common prefix.
Input: ["flower", "flow", "flight"]
Expected Result: "fl" 
*/

import java.util.Arrays;

class longestCommonPrefix {

    public static void main(String[] args) {
        String[] strArray= {"flower", "flow", "flight"};
        Arrays.sort(strArray);
        String first= strArray[0];
        String last= strArray[strArray.length-1];
        int lenghtOfFirst=first.length();
        String result="Found";
        for(int i=lenghtOfFirst;i>=0;i--){
            if (last.contains(first.substring(0,i))) {
                result=first.substring(0,i);
                break;
                
            }
        }
        
            System.out.println(result);
        

    }
    
    
}
