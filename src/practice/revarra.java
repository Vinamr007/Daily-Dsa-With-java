package practice;

public class revarra {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        int st=0,end=arr.length-1;
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
