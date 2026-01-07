package practice;

public class MINmaxArray {
    public static void main(String[] args) {
        int[] arr={34,2,56,23,89,1,67,45};
        int min=arr[0];
        int max=arr[0];
        //for min
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];

            }
        }
        // for max
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);



    }
}
