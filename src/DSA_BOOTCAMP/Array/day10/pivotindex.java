package DSA_BOOTCAMP.Array.day10;



    public class pivotindex{

        public static void main(String[] args) {

            int[] arr = {1, 7, 3, 6, 5, 6};

            for (int i = 0; i < arr.length; i++) {

                int leftSum = 0;
                int rightSum = 0;

                // Calculate left sum
                for (int j = 0; j < i; j++) {
                    leftSum += arr[j];
                }

                // Calculate right sum
                for (int j = i + 1; j < arr.length; j++) {
                    rightSum += arr[j];
                }

                if (leftSum == rightSum) {
                    System.out.println("Pivot Index = " + i);
                    return;
                }
            }

            System.out.println("Pivot Index = -1");
        }
    }

