package practice;

public class DuplictateIinArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,6,7,8,2};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate element found: " + arr[i]);
                }
            }
        }
    }
}
