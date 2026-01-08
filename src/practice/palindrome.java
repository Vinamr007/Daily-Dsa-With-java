package practice;

public class palindrome {
    public static void main(String[] args) {
        int v=12321;
        int v1=0;
        while(v>0){
            int digit=v%10;
            v1=v1*10+digit;
            v=v/10;
        }
if(v1==v){
    System.out.println("palindrome");
}
else{
    System.out.println("not a palindrome");
}
    }
}
