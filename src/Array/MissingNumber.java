package Array;

public class MissingNumber {
    public static void main(String[] args) {
           int[] arr = {3, 0, 1};
        int n = arr.length;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number = " + missingNumber);


    }
}
