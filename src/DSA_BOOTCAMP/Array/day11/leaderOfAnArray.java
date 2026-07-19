package DSA_BOOTCAMP.Array.day11;

public class leaderOfAnArray {
    public static void main(String[] args) {
        int[] a={16, 17, 4, 3, 5, 2};

      //  int[] result=new int[a.length];

        for(int i=0;i<a.length;i++){
            boolean isleader=true;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j]){
                   isleader=false;
                   break;
                }
            }

            if(isleader){
                System.out.print(a[i]+" ");
            }
        }
    }
}
