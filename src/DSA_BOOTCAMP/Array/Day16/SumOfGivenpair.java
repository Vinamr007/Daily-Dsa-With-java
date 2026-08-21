package DSA_BOOTCAMP.Array.Day16;

public class SumOfGivenpair {
    public static void main(String[] args) {
        int[] a={   2, 7, 11, 15, 3, 6     };
        int target=9;


        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i]+a[j]==target){
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }
}
