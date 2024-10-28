public class SW_smallestSubararyWithSumGreaterThen {
/*
 * 2. Smallest Subarray with Sum ≥ X
Problem Statement: Find the length of the smallest subarray with a sum ≥ X.
Input: [1, 2, 3, 4, 5], X = 11
Expected Result: 3
Explanation: The subarray [3, 4, 5] gives a sum of 12, with length 3.


 */

    public static void main(String[] args) {
        
        int arr[]={1, 2, 3, 4, 5};
        int k=11;//X
        int rs=0;
        int i=0;
        int j=0;
        int min=Integer.MAX_VALUE;
        while(rs<k && j<arr.length )
        {
            rs=rs+arr[j];
            
            while(rs>=k && i<=j){
                min=Math.min(min,j-i+1);
                rs=rs-arr[i];
                i++;

            }
            j++;

        }
        System.out.println(min);


    }
    
}
