public class removeVowelsFromString {
    /*
     * 
     * Remove Vowels from String
Problem Statement: Given a string, remove all vowels and return the modified string.
Input: "leetcodeisfun"
Expected Result: "ltcdsfn"
     */

     public static void main(String[] args) {
        String input="leetcodeisfun";
        int i=0;
        String ans="";
        while(i< input.length()) {

            if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u' || input.charAt(i)=='A' || input.charAt(i)=='E' || input.charAt(i)=='I' || input.charAt(i)=='O' || input.charAt(i)=='U' ){
                
            }else{
                ans=ans+input.charAt(i);
            }
            i++;
            
            
        }
        System.out.println(ans);
        
     }
    
}
