package DSA_BOOTCAMP.pattern.tricky;

public class Amastrong {
    public static void main(String[] args) {
        int a=153;
        int a1=a;
        int sum=1;
        int rem, rev=0;
        while(a>0){
            rem=a%10;
            rev=rev+rem*rem*rem;
            a=a/10;
        }
        if(a1==rev){
            System.out.println("num is amstring");
        }else{
            System.out.println("not amstrong");
        }
    }
}
