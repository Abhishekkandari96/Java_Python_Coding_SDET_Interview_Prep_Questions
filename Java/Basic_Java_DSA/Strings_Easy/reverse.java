
class Demo{
/*
Reverse a String
Problem Statement: Given a string s, reverse the string and return it.
Input: "hello"
Expected Result: "olleh"
 */


    public static void main(String args[]){
        String str= "Abhishek";
        String res="";
        for(int i=str.length()-1;i>=0;i--){
            res=res+str.charAt(i);
        }
        System.out.println(res);

    }
}

