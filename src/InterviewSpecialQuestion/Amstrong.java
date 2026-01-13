package InterviewSpecialQuestion;

public class Amstrong {
    public static void main(String[] args) {
//        int n = 153;
//        int n1, rev = 0, sum = 0;
//        n1 = n;
//        while (n > 0) {
//            rev = n % 10;
//            sum = sum + (rev * rev * rev);
//            n = n / 10;
//        }
//        if (sum == n1) {
//            System.out.println("amstrong number");
//        } else {
//            System.out.println("not a amstrong number");
//        }
    int n=153;
    int n1=n;
    int rev=0,sum=0;
    while(n>0){
        rev=n%10;
        sum=sum+(rev*rev*rev);
        n=n/10;
    }
    if(sum == n1){
        System.out.println("amstrong number");
    }
    else {
        System.out.println("not a amstrong number");


    }


    }
}