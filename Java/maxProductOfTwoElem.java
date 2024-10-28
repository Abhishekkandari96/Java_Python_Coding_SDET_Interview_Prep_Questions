
import java.util.Arrays;

public class maxProductOfTwoElem {
 
    
    /*
     *  [1, 5, 3, 4, 2]
     */

     public static void main(String[] args) {
        int[] arr ={1,5,3,4,2};
        Arrays.sort(arr);
        int max=0;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]!=arr[i-1]){
                max=arr[i]*arr[i-1];
                break;
            }
        }
        System.out.println(max);
     }
}
