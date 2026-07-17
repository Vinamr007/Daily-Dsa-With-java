package DSA_BOOTCAMP.Array.day11;

public class SecondHeightestNumber {
    public static void main(String[] args) {
        int[] a={15,56,4,8,1,2,4,1,45,85,2};
        int max=a[0];
        int secmax=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }

        for(int i=0;i<a.length;i++){
            if(a[i]>secmax && a[i]<max){
                secmax=a[i];
            }
        }
        System.out.println(secmax);
    }
}
