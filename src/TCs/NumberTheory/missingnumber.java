package TCs.NumberTheory;

public class missingnumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
       int sum=0;
       for(int i=0;i<arr.length;i++){
           sum+=arr[i];
       }

       int expextedsum=n*(n+1)/2;

       int missingnumber=expextedsum-sum;
       System.out.println("missing number = "+missingnumber);
    }
}
