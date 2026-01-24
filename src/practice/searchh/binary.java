package practice.searchh;

public class binary {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int st = 0, end = arr.length - 1;
        while (st < end) {
            int mid = st + (end - st) / 2;
            if (target == arr[mid]) {
                System.out.println(mid);
                break;
            } else if (target > arr[mid]) {
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    }
}
