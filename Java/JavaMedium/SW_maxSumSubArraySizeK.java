

public class SW_maxSumSubArraySizeK {
    /*
     * 1. Maximum Sum Subarray of Size K
Problem Statement: Find the maximum sum of any contiguous subarray of size K.
Input: [2, 1, 5, 1, 3, 2], K = 3
Expected Result: 9
     */


     public static void main(String[] args) {
        int arr[]={2, 1, 5, 1, 3, 2};
        int k=3;
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=0;
        int rs=0;
        while(i<arr.length && j<arr.length){
            rs=rs+arr[j];
            if(k==j-i+1){
                max=Math.max(max,rs);
                rs=rs-arr[i];
                i++;
            }
            j++;
        }
        System.out.println("Ans is "+ max );

        
     }
}
