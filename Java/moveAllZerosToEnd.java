
import java.util.Arrays;

public class moveAllZerosToEnd {
    /*
     * Move All Zeros to the End
Problem Statement: Move all zeros to the end of the array, preserving the order of non-zero elements.
Input: [0, 1, 0, 3, 12]
Expected Result: [1, 3, 12, 0, 0]
     */

     public static void main(String[] args) {
        
        int[] nums={0,1,0,3,12};
        int positionNumber=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[positionNumber]=nums[i];
                positionNumber++;
            }
        }
        for (int i = positionNumber; i < nums.length; i++){
            nums[i]=0;
        }
        System.out.println(Arrays.toString(nums));

        
     }
    
}
