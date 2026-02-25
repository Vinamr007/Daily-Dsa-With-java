package TCs.Arraya;

public class Consugativeones
{
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1,0,1};
        int count=0;
        int maxcount=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]==0){
               count=0;
           }
            else if(arr[i]==1){
                count++;
            }

            if(count>maxcount){
                maxcount=count;
            }

        }
        System.out.println(maxcount);

    }
}
