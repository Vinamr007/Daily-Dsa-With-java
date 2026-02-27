package TCs.Arraya;

public class equalsum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6};
       int st=0,end=arr.length-1;
       int sum1=0,sum2=0;
       for(int i=0;i<arr.length;i++){

           for(int j=0;j<i;j++){
               sum1+=arr[j];
           }
           for(int k=i+1;k<arr.length;k++){
               sum2+=arr[k];
           }
           if(sum1==sum2){
                System.out.println("equal sum at index "+i);
                return;
              }
              else{
                sum1=0;
                sum2=0;
           }

       }



    }
}
