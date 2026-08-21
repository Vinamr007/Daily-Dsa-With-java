package Qspider.Method;

public class method11 {
  static  int num=1234;
  static  int num1=1234;



//    public static void reverse(){
//
//        int rev=0;
//        for(int i=num1;i>0;i=i/10){
//            int rem=i%10;
//            rev=rev*10+rem;
//        }
//        System.out.println("reverse "+rev);
//    }
//    public static void sumofdigit(){
//        int sum=0;
//        while(num>0){
//            int digit=num%10;
//            sum=sum+digit;
//            num/=10;
//        }
//        System.out.println("sum of digit "+sum);
//    }
//public static void sumOfproduct(){
//        int product=1;
//        while(num>0){
//            int digit=num%10;
//            product*=digit;
//            num/=10;
//        }
//    System.out.println("sum of product "+product);
//}

    public static void  IsPalindrome(){
        int nu =num;
        boolean flag= false;
        int rev=0;
        for(int i=num1;i>0;i=i/10){
            int rem=i%10;
            rev=rev*10+rem;
        }
        if(rev==nu){
            flag=true;
            System.out.println("number is palindrome");
        }else{
            System.out.println("number is not palindrome");
        }
    }
    public static void isevenOdd(){
        if(num%2==0){
            System.out.println("number is even");
        }else{
            System.out.println("number is not even");
        }
    }

    public static void main(String[] args) {

// sumofdigit();
//reverse();
//sumOfproduct();
// IsPalindrome();

//isevenOdd();


    }



//    public static boolean palindromee(int num){
//        int rev=0;
//        boolean ispalindrome=false;
//        int num1=num;
//        while(num>0){
//            int digit=num%10;
//            rev=rev*10+digit;
//            num=num/10;
//        }
//        if(rev==num1){
//            ispalindrome=true;
//            System.out.println("palindrome");
//        }
//        return ispalindrome;
//    }
//
//    public static String IsEvenOdd(int num){
//        String op="";
//        if(num%2==0){
//            op="even";
//        }else{
//            op="odd";
//
////        System.out.println(op);
//        }
//        return op;
//    }

}
