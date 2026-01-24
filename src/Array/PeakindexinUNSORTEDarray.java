package Array;

public class PeakindexinUNSORTEDarray {
    public static void main(String[] args) {
//wrongcode

        int[] arr = {2, 1, 4, 7, 3, 9, 5};

        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                System.out.println("Peak found at index: " + i);
               // break;
            }
        }
    }
}
