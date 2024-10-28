public class SW_SubarrayWithProductLessThenK {

    /*
     * 10. Subarrays with Product Less Than K
Problem Statement: Find the number of contiguous subarrays where the product of all elements is less than K.
Input: [10, 5, 2, 6], K = 100
Expected Result: 8
     */

     public static void main(String[] args) {
        int arr[]={10,5,2,6};
        int pro=100;
        int i =0;
        int rp=1;
        int count=0;

        for(int j=0;j<arr.length;j++){
            rp=rp*arr[j];

            while(rp>=pro && i<=j){
                rp=rp/arr[i];
                i++;
            }
            count = count+ j - i + 1;

            /*
              For example:

If i = 0 and j = 2, the window is [10, 5, 2].

Valid subarrays ending at j = 2 are:

[2] (single element)
[5, 2] (two elements)
[10, 5, 2] (three elements)
Number of subarrays = 3 = 2 - 0 + 1.


             */

        }
        System.out.println(count);
        
     }
    
}
