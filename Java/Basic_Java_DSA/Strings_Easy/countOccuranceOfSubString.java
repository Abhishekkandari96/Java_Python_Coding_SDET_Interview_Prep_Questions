class countOccuranceOfSubString {
    /*
 Count Occurrences of a Substring
Problem Statement: Given two strings, count how many times the second string occurs in the first.
Input: "ababcabc", Substring: "abc"
Expected Result: 2

     */

     public static void main(String[] args) {
        String originalString="ababcabcabc";
        String tofind="abc";

        int i=0;
        int j=tofind.length();
        int count =0;
        while(j<=originalString.length()){
            String curret= originalString.substring(i, j);
            if(curret.equals(tofind)){
                count++;
            }
            j++;
            i++;

        }
        System.out.println(count);
        
     }
    
}
