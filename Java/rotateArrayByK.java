
import java.util.Arrays;



class rotateArrayByK{

    /*
     * Rotate Array by K Positions
Problem Statement: Rotate the given array to the right by K positions.
Input: [1, 2, 3, 4, 5], K = 2
Expected Result: [4, 5, 1, 2, 3]
     */
    static void reverse(int arr[],int start,int end){

        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }

        }
     public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int k=2;
        reverse(arr,0,k);
        reverse(arr, k+1, arr.length-1);
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
      





        
    }
}