
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findInterSectionOfArray {
    /*
     * 
Find the Intersection of Two Arrays
Problem Statement: Return the common elements from two arrays.
Input: [1, 2, 2, 1], [2, 2]
Expected Result: [2, 2]
     */
    public static void main(String[] args) {
        int[] first={1,2,2,1};
        int[] second={2,2};
        List<Integer> ls=new ArrayList<>();
        HashMap<Integer,Integer> fhm=new HashMap<>();
        for(int i=0;i<first.length;i++){
            fhm.put(i, first[i]);
        }
        for(int i=0;i<second.length;i++){
            if(fhm.containsValue(second[i])){
                ls.add(second[i]);
            }
        }
        System.out.println(ls);


    }
    
}
