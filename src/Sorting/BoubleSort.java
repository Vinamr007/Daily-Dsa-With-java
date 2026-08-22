package Sorting;

public class BoubleSort
{
    public static void BiubleSortt(int[] arr,int n){

        for(int i=0;i<n;i++){

            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
 for(int a: arr){
     System.out.print(a+" ");
 }

    }
    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2};
int n=arr.length;
BiubleSortt(arr,n);
    }
}
// Pass 1: [5,3,8,4,2]
// 5,3 -> swap -> [3,5,8,4,2]
// 5,8 -> no swap
// 8,4 -> swap -> [3,5,4,8,2]
// 8,2 -> swap -> [3,5,4,2,8]

// Pass 2: [3,5,4,2,8]
// 3,5 -> no swap
// 5,4 -> swap -> [3,4,5,2,8]
// 5,2 -> swap -> [3,4,2,5,8]

// Pass 3: [3,4,2,5,8]
// 3,4 -> no swap
// 4,2 -> swap -> [3,2,4,5,8]

// Pass 4: [3,2,4,5,8]
// 3,2 -> swap -> [2,3,4,5,8]