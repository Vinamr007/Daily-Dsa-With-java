package Qspider.Method;

public class method11 {

static int reverse(int num){
    int rev=0;

    while(num>0){
        int digit=num%10;
        rev=rev*10+digit;
        num=num/10;
    }
  return rev;
}
    public static int sumofdigit(int num){

        int sum=0;

        while(num>0){
            int rem=num%10;
            sum+=rem;
           num=num/10;
        }
        return sum;

    }
public static int SumOfProduct(int num){
        int product=1;
        while(num>0){
            int rem=num%10;
            product*=rem;
            num=num/10;
        }
        return num;

}
public static boolean palindromee(int num){
    int rev=0;
    boolean ispalindrome=false;
int num1=num;
    while(num>0){
        int digit=num%10;
        rev=rev*10+digit;
        num=num/10;
    }
    if(rev==num1){
ispalindrome=true;
        System.out.println("palindrome");
    }
    return ispalindrome;
}

public static String IsEvenOdd(int num){
    String op="";
    if(num%2==0){
        op="even";
    }else{
        op="odd";

//        System.out.println(op);
    }
    return op;
}

public static String binary(int num){
    String op="";
    int i=num;

    while(i>0){
        int rem=i%2;


    }
}

    public static void main(String[] args) {
        int num=1234;
        int result = sumofdigit(num);
        System.out.println(result+"sum of digit");

        int sum=SumOfProduct(num);
        System.out.println(sum+"sum of product");

        int result3 = reverse(num);
        System.out.println(result3+" reverse");

        boolean palindrome=palindromee(num);
        System.out.println(palindrome);

        String result1=IsEvenOdd(num);
        System.out.println(result1+"isEvenOdd");

    }
}
