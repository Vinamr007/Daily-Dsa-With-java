package TCs.NumberTheory;

public class IncreasingArray {
    public static void main(String[] args) {
        int[] arr={3,2,5,1,7};
int  count =0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                arr[i]=arr[i-1];
                count=arr[i-1];
            }
        }
        System.out.println(count);
//        for(int num: arr){
//            System.out.print(num+" ");
//        }
    }

}
