package DSA_BOOTCAMP.STRINGG.Day1;

public class Palindrome {
    public static void main(String[] args) {
        String str="vinu niv";
        boolean ispalindrome=true;
        int st=0,end=str.length()-1;
        while(st<end){
            if(str.charAt(st)!=str.charAt(end)){
               ispalindrome=  false;
break;
            }
                st++;
                end--;


        }
        if(ispalindrome){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}
