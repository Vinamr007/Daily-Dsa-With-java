package Java_Interview_question.Interview;

public class PrimeNumber {
    public static void main(String[] args) {
        int n= 7;
        boolean isPrime=true;

        if(n<=1){
            isPrime=false;
        }else{
            for(int i=2;i<=n/i;i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
