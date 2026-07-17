package DSA_BOOTCAMP.Array.day11;

public class isprime {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;

    }

    public static void main(String[] args) {
        int num=47;
        System.out.println(isPrime(num));
    }
}
