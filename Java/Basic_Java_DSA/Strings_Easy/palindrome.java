/**
Check for Palindrome
Problem Statement: Check if a given string is a palindrome (reads the same forward and backward).
Input: "racecar"
Expected Result: True
 */
class Demo2 {

    static boolean palindromeCheck(String str){
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
               return false;
            
            }
            i++;
            j--;
        }
        return true;

    }
    public static void main(String[] args) {
        String str= "racecar";
        boolean result= palindromeCheck(str);
        if (result) {
            System.out.println("result is: True");
        }else
        {
            System.out.println("result is: false");
        }
       
        
        
    }
}