package TCs.NumberTheory;

public class sumofdigit {
    public static void main(String[] args) {
        int a=123;
        int sum=0,rev,rem=0;

        while(a>0){
            rem=a%10;
            sum=sum+rem;
            a=a/10;
        }
        System.out.println(sum);
    }
}
