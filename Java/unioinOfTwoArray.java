import java.util.ArrayList;
import java.util.HashSet;

public class unioinOfTwoArray {
    /*
     * Find the Union of Two Arrays
Problem Statement: Return the union of two arrays, containing unique elements.
Input: [1, 2, 3], [2, 3, 4]
Expected Result: [1, 2, 3, 4]
     */
    static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> st = new HashSet<>();

        // Put all elements of a[] in st
        for (int num : a)
            st.add(num);

        // Put all elements of b[] in st
        for (int num : b)
            st.add(num);
		
      	ArrayList<Integer> res = new ArrayList<> ();
      
        // iterate through the set to fill the result array 
        for(int it: st) 
            res.add(it);

        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};

        ArrayList<Integer> res = findUnion(a, b);

        for (int num : res)
            System.out.print(num + " ");
    }
    
}
