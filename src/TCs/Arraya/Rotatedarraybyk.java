package TCs.Arraya;

public class Rotatedarraybyk {
    public static void rotate(int[] arr,int st,int end) {
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
    public static void rotate2(int[] arr,int k){
        //int k;
        k%=arr.length;

        rotate(arr,0,arr.length-1);
        rotate(arr,0,k-1);
        rotate(arr,k,arr.length-1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=2;
rotate2(arr,k);
    }
}
