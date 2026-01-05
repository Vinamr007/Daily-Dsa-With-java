package String;


public class palindromestr {
    public static void main(String[] args) {
        String s="madam";
        palindromestr p=new palindromestr();
        boolean result = p.ispalindrome(s,0,s.length()-1);
        System.out.println(s + " is palindrome? " + result);

    }
    boolean ispalindrome(String s,int st,int end){
        if(st>=end){
            return true;
        }
        if(s.charAt(st) != s.charAt(end)){
            return false;
        }
        return ispalindrome(s,st+1,end-1);
    }
}
