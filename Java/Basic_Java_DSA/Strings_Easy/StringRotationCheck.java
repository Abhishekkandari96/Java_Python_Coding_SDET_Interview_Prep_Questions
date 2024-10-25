class StringRotationCheck {
    /*
     * String Rotation Check
Problem Statement: Check if one string is a rotation of another.
Input: "abcde", "cdeab"
Expected Result: True
     */

     public static void main(String[] args) {
        
         String first="abcde";
         String second="cdeab";
         String onSearch= first+first;
         if(onSearch.contains(second)){
            System.out.println("True");
         }else{
            System.out.println("False");
         }
     }
}
