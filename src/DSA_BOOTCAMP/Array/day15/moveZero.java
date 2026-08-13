package DSA_BOOTCAMP.Array.day15;

public class moveZero {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        int index = 0;

        // Put all non-zero elements at the beginning
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with zeros
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        // Print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
