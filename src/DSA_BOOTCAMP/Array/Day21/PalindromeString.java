package DSA_BOOTCAMP.Array.Day21;

public class PalindromeString {
    public static void main(String[] args) {
        String a="abcba";

        String v="";


        for(int i=a.length()-1;i>=0;i--){
            v=v+a.charAt(i);
        }

        if(a.equals(v)){
            System.out.println("string is palindrome");
        }else{
            System.out.println("string is not palindrome");
        }

    }
}
