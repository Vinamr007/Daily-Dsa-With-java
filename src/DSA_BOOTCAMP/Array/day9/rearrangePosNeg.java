package DSA_BOOTCAMP.Array.day9;

public class rearrangePosNeg {
    public static void main(String[] args) {
        int[] a={-1, 2, -3, 4, -5, 6};
        int index=0;
        int count=0;
int[] result=new int[a.length];
        for (int i=0;i<a.length;i++){
            if(a[i]<0){
                result[index]=a[i];
                index++;
            }
        }
        for(int i=0;i<result.length;i++){
            if(a[i]>=0){
                result[index]=a[i];
                index++;

            }
        }
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
