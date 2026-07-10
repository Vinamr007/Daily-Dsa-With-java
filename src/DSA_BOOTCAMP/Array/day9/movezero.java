package DSA_BOOTCAMP.Array.day9;

public class movezero {
    public static void main(String[] args) {
        int[] a={2,0,3,0,4,50,0};
        int[] result=new int[a.length];
        int index=0;
        for(int i=0;i<a.length;i++){

            if(a[i]!=0){
                result[index]=a[i];
            }
            if(a[i]!=0){
                index++;
            }
        }

        for(int i=index+1;i<result.length;i++){
            result[i]=0;
        }
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
