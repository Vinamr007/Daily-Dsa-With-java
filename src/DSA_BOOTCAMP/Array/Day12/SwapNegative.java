package DSA_BOOTCAMP.Array.Day12;

public class SwapNegative {
    public static void main(String[] args) {
        int[] a={1, -2, 3, -4, 5, -6};

        int[] result=new int[a.length];
        int index=a[0];
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                count++;
            }
            if(a[i]<0){
                result[index]=a[i];
            }

        }
for(int i=0;i<result.length;i++){
    System.out.print(result[i]);
}
    }
}
