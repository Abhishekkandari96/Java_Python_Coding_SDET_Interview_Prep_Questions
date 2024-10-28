
import java.util.Arrays;
import javax.sound.sampled.SourceDataLine;

public class findPairWithGivenSum {
    /*
     * Find the Pair with Given Sum
Problem Statement: Find a pair of numbers in the array that adds up to a given sum.
Input: [2, 7, 11, 15], Sum = 9
Expected Result: (2, 7)
     */

     public static void main(String[] args) {
        int [] arr= {2, 7, 11, 15};
        int sum = 13;

        Arrays.sort(arr);

        int first=0;
        int last=arr.length-1;

        while(first<last){
            int current=arr[first]+arr[last];
            if(current<sum){
                first++;
            }else if (current>sum) {
                last--;
                
            }else if (current==sum){
                break;
            }

            }
            System.out.println("Elements are :"+arr[first]+" and "+arr[last]);
        }
    
        
     }

