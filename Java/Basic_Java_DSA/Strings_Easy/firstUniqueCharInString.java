import java.util.HashMap;

class firstUniqueCharInString {
    /*First Unique Character in a String
Problem Statement: Find the first non-repeating character in the string. If none, return -1.
Input: "loveleetcode"
Expected Result: 2 (Character: 'v')
 */
public static void main(String[] args) {
    
    String input="loveleetcode";
    HashMap<Character,Integer> hm= new HashMap<>();
    for(char ch:input.toCharArray()){
        hm.put(ch,hm.getOrDefault(ch,0)+1);
    }
    int ans=-1;
    for(int i=0;i<input.length();i++){
        if(hm.get(input.charAt(i))==1){
            ans=i;
            break;
        }
    }
        System.out.println(ans);
    
    
}
    
}
