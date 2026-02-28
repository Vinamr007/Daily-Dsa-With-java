package TCs.Arraya;

public class FirstNegativeElementInEveryWindow {

    public static void firstnegative(int[] arr,int k){
        int[] result=new int[arr.length-k+1];
        int idx=0;

        for(int i=0;i<arr.length-k;i++){
                boolean found = false;
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    result[idx++]=arr[j];
                    found=true;
                    break;
                }
            }

                if(!found){
                    result[idx++]=0;
                }
        }
        for (int val : result) {
            System.out.print(val + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr={-8, 2, 3, -6, 10};
        int k=2;
        firstnegative(arr,k);
    }
}
