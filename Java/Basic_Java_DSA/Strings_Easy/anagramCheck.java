import java.util.Arrays;

/**
 
Anagram Check
Problem Statement: Check if two given strings are anagrams of each other.
Input: "listen", "silent"
Expected Result: True

 */
public class anagramCheck {

    public static void main(String[] args) {
        String first="listen";
        String second= "silent";
        char[] fc=first.toCharArray();
        char[] sc=second.toCharArray();
        Arrays.sort(fc);
        Arrays.sort(sc);
        if(Arrays.equals(fc, sc)){
            System.out.println("True");


        }
        else{
            System.out.println("False");
        }


    }

    
}