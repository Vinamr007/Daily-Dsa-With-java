package DSA_BOOTCAMP.Array.day8;

public class missingnumber {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
// Largest number should be length + 1
        int n = a.length + 1;

        int expectedSum = n * (n + 1) / 2;

        int missing = expectedSum - sum;

        System.out.println(missing);
    }
}
