package Sorting;

public class BubbleSort {
    static void swap(int[] arr,int st,int end){
        int temp=arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
    }


    static void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        printarr(arr);
    }
}
