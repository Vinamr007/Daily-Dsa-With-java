package TCs.String;


public class PALINDROME {
    public static boolean ispalindrome(String s){
        int st=0, end=s.length()-1;
        boolean found=false;
        while(st<end){
            if(s.charAt(st) != s.charAt(end)){
                System.out.println("Not a palindrome");
                return false;
            }
            st++;
            end--;
        }
        if(found =true){
            System.out.println("Palindrome");
        }
        return true;
    }
    public static void main(String[] args) {
        String s="abba";
        ispalindrome(s);
    }
}
