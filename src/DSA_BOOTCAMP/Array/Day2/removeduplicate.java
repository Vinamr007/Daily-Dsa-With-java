package DSA_BOOTCAMP.Array.Day2;

public class removeduplicate {
    public static void main(String[] args) {
       int[] a = {1, 2, 2, 3, 4, 4, 5};

        int[] b = new int[a.length];

        int j = 0;

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] != a[i + 1]) {
                b[j] = a[i];
                j++;
            }
        }

        // Add the last element
        b[j] = a[a.length - 1];

        for (int i = 0; i <= j; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
