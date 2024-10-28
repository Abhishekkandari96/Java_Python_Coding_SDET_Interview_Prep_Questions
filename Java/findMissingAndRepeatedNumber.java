
import java.util.Arrays;

public class findMissingAndRepeatedNumber {
    /*
     * Find the Missing and Repeated Number
Problem Statement: In a given array of size N, one number is missing, and one is repeated. Find them.
Input: [1, 2, 2, 4]
Expected Result: (3, 2)
     */

     public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5};
        int repeated=-1;
        int missing=-1;
       Arrays.sort(arr);
       for(int i=1;i<arr.length;i++){
        if(arr[i]-arr[i-1]==0){
            repeated= arr[i];
        missing=arr[i]+1;
            
        }

       }
       System.out.println("repeated number is "+repeated+" and missing number is "+missing);


     }
}
