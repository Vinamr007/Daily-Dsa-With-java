package DSA_BOOTCAMP.Array.Day2;

public class largetestnum {
    public static void main(String[] args) {
        int[] a={5, 3, 9, 2, 8};
 int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
