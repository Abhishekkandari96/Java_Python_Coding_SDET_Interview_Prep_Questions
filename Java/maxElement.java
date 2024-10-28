package Java;
class maxElement {
/*
 * Find the Maximum Element in an Array
Problem Statement: Find the largest element in the given array.
Input: [1, 3, 5, 2, 4]
Expected Result: 5
vd java
 */

    public static void main(String[] args) {
        
        int[] arr = {1, 3, 5, 2, 4};
        int max = arr[0];  // Initialize max with the first element

        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        System.out.println(max);  // Output: 5
    }
    }
    

