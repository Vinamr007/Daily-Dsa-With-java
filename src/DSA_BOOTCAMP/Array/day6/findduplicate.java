package DSA_BOOTCAMP.Array.day6;

public class findduplicate {

    public static void main(String[] args) {

        int[] a = {5, 6, 5, 7, 8, 7};

        int count;

        for (int i = 0; i < a.length; i++) {

            // Check if this element has already been processed
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            // Count frequency
            count = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(a[i]);
            }
        }
    }
}