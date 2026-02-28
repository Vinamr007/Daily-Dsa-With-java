package TCs.Arraya;

public class maximumSubarray {
    public static void subarray(int[] arr,int maxsubarray){
        int maxsum=0;
        for(int i=0;i<arr.length-1;i++){
            int sum=0;
            for(int j=i+1;j<=i+1;j++){
              sum=  arr[i]+arr[j]; }
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int[] arr={10,15,-5,15,-10,5};
        int maxsubarray=2;

        subarray(arr,maxsubarray);

    }
}
