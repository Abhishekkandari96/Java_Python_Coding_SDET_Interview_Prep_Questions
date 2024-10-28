public class removeWhiteSpaces {
    /*
     * Remove All Whitespaces from a String
Problem Statement: Remove all spaces from the given string.
Input: "a b c"
Expected Result: "abc"
     */
    public static void main(String[] args) {
        String input= "a b c";
        input=input.replace(" ", "");
        System.out.println(input);
    }
    
}
