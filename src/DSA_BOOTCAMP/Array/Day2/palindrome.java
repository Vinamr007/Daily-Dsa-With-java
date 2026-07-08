package DSA_BOOTCAMP.Array.Day2;

public class palindrome {
    public static void main(String[] args) {
        String s="madam";
        String r="";

        for(int i=0;i<s.length();i++){
            r=s.charAt(i)+r;
        }
        if(s.equals(r)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
