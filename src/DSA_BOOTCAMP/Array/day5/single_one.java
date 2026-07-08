package DSA_BOOTCAMP.Array.day5;

public class single_one {
    public static void main(String[] args) {
        int[] a={10,20,30,20,10};

        int count;

        for (int i = 0; i < a.length; i++) {

            count = 0;

            for (int j = 0; j < a.length; j++) {

                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(a[i]);
                break;   // Stop after finding the single element
            }
        }
    }
}
