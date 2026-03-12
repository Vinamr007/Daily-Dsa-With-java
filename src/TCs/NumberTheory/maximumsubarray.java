package TCs.NumberTheory;

public class maximumsubarray {
    public static void main(String[] args) {
        int[] arr={-2,-4};

        int maxsum=arr[0];
        int sum=0;
        for(int i=0;i<arr.length;i++){

               sum+=arr[i];
                if(sum>maxsum){
                    maxsum=sum;
                }
                if(sum<0)
                {
                    sum=0;
                }
        }
        System.out.println(maxsum);
     }
}
