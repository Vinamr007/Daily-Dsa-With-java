package DSA_BOOTCAMP.Array.Day12;

public class sumofsubarray {
    public static void main(String[] args) {
     int arr[] = {1, 4, 20, 3, 10, 5};
        int k  = 33;


        int sum;

        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }
    }
}
