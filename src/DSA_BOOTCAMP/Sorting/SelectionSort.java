package DSA_BOOTCAMP.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={64,25,12,22,11};

        for(int  i=0;i<arr.length-1;i++){
            int minIdex=i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIdex]){
                    minIdex=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[minIdex];
            arr[minIdex]=temp;
        }

        for(int num : arr){
            System.out.print(num+" ");
        }

    }
}
