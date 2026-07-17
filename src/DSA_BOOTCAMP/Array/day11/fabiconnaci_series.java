package DSA_BOOTCAMP.Array.day11;

public class fabiconnaci_series {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

       // fabiconnaci_series f=new fabiconnaci_series();
        int n=4;
        System.out.println(fibonacci(n));
    }
}
