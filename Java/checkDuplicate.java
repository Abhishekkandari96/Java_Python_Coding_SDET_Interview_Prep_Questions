import java.util.Arrays;

/*
 * Check for Duplicates in an Array
Problem Statement: Check if the array contains any duplicate elements.
Input: [1, 2, 3, 4, 2]
Expected Result: True
 */
class checkDuplicate {

    public static void main(String[] args) {
        int [] arr= {1, 2, 3, 4, 2};
        Arrays.sort(arr);
        boolean flag=false;
        for (int idx = 1; idx < arr.length; idx++) {
           if(arr[idx-1]==arr[idx]){
            flag=true;

           }
            
        }
        System.out.println(flag);
    }


    
    
}
