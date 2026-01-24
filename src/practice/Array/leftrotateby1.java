package practice.Array;

public class leftrotateby1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int temp=arr[0];


        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];

        }
        arr[n-1]=temp;
        for(int num : arr){
            System.out.println(num);
        }
    }
}
