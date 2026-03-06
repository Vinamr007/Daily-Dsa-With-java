package TCs.NumberTheory;

public class ReminderWithoutOperator {
    public static void reminder(int a, int b){
        while(a>=b){
            int rem=a-b;

            a=rem;
        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        int a=10;
        int b=3;

reminder(a,b);
    }
}
