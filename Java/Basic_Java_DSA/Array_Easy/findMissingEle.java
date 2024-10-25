package Java.Basic_Java_DSA.Array_Easy;
/*
 * Find the Missing Number in an Array (1 to N)
Problem Statement: Find the missing number from an array containing numbers from 1 to N.
Input: [1, 2, 4, 5], N = 5
Expected Result: 3
 */
public class findMissingEle {
    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 4, 5};
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                System.out.println(arr[i]);
            }
        }

    }
}
