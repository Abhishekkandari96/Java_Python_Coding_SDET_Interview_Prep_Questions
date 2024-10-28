public class StringContainsDigit {
    /*
     * Check if a String Contains Only Digits
Problem Statement: Verify if a given string contains only numeric digits.
Input: "12345"
Expected Result: True
     * 
     */

     public static void main(String[] args) {
        String str="1234a5";
        boolean flag =true;
        for (int i = 0; i < str.length(); i++) {
            Character current=str.charAt(i);
            if(Character.getNumericValue(current)>=0 && Character.getNumericValue(current)<=9 ){
                continue;
            }
            else{
    
                flag=false;
            }
            
        }
        System.out.println(flag);
     }
    
}
