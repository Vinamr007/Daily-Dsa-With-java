package DSA_BOOTCAMP.Array.day6;

public class largestelement
{
    public static void main(String[] args) {
        int[] a={12, 45, 7, 89, 23};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];

            }
        }
        System.out.println(max);
    }
}
