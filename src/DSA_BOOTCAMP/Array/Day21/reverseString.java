package DSA_BOOTCAMP.Array.Day21;

public class reverseString {
    public static void main(String[] args) {
        String s="vinu";

       String v="";


       for(int i=s.length()-1;i>=0;i--){
           v=v+s.charAt(i);
       }
        System.out.println(v);

    }
}
