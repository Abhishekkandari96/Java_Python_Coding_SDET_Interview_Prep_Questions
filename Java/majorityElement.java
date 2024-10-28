
import java.util.HashMap;

public class majorityElement {
    /*
     * Find the Majority Element
Problem Statement: Find the element that appears more than n/2 times in the array.
Input: [3, 2,1, 3]
Expected Result: 3
     */


     public static void main(String[] args) {
        int[] arr ={3,6,3};
        int length= arr.length;
        int majority=length/2;
        if (majority%2!=0) {
            majority=majority+1;
            
        } 
        HashMap<Integer,Integer> hm =new HashMap<>();
       for (int i : arr) {
         hm.put(i, hm.getOrDefault(i, 0)+1);
       }

       for(int key:hm.keySet()){
        if(hm.get(key)>=majority){
            System.out.println(key);
        }
       }


        
     }
}
