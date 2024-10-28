public class removeAllOccuranceOfACharacter {
    /*
     * Remove All Occurrences of a Character
Problem Statement: Remove all occurrences of a given character from the string.
Input: "hello", Character: 'l'
Expected Result: "heo"
     */

     public static void main(String[] args) {
        String str="hello";
        char c='h';
        char[] cA =str.toCharArray();
        System.out.println(cA.toString());
        String str2="";
        for(char ch:cA){
            if(ch!=c){
                str2=str2+ch;
            }
        }
        System.out.println(str2);



     }
    
}
