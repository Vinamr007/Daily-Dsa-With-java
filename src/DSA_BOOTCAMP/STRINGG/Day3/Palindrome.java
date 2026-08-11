package DSA_BOOTCAMP.STRINGG.Day3;

public class Palindrome {
    public static void main(String[] args) {
        String str="asddsa";

        int st=0,end=str.length()-1;
boolean palindrome=false;
        while(st<end){
            if(str.charAt(st)==str.charAt(end)){
                st++;
                end--;
                palindrome=true;
            }else{
                System.out.println("string is not palindrome");
                break;
            }
        }
        if(palindrome==true){
            System.out.println("string palindrome");
        }
    }
}
