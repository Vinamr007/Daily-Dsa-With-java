package InterviewSpecialQuestion;

public class Palindrome {
    public static void main(String[] args) {
        int a=121;
        int a1=a;

        int rev=0;
        while(a>0){
            int digit=a%10;
            rev=rev*10+digit;
            a=a/10;
        }
        if(rev==a1){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
