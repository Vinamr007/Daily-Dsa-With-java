package TCs.NumberTheory;

public class RepeatAndmissingNumber {
    public static void main(String[] args) {
        int[] arr={2,2};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        int expectedsum=n*(n+1)/2;
        int c=expectedsum-sum;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println(arr[i]+" "+(c+arr[i]));
            }
        }

    }
}
