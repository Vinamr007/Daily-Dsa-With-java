package practice.DSA;

public class firstDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 3};

        for (int i = 0; i < arr.length; i++) {
            int count=1;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>1){
                System.out.println(arr[i]);
                return;
            }
        }
    }
}
