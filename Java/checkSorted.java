
/*
 * Check if Array is Sorted
Problem Statement: Check if the given array is sorted in ascending order.
Input: [1, 2, 3, 4, 5]
Expected Result: True
 */
public class checkSorted {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};
        boolean flag= true;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<nums[i-1]){
                flag= false;
                break;
            }
            
        }
        System.out.println(flag);
    }
    
}
