package Qspider.Method;

public class method11 {
    public static int sumofdigit(int num){

        int sum=0;

        while(num>0){
            int rem=num%10;
            sum+=rem;
           num=num/10;
        }
       return sum;

    }

    public static void main(String[] args) {
        int num=1234;
        int result = sumofdigit(num);
        System.out.println(result);
//    }
//    public static void sumOfDigit(){
//        int sum=0;
//        for(int i=num;i>0;i=i/10){
//
//        }
    }
}
