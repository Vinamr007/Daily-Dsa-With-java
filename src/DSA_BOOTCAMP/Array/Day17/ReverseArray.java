package DSA_BOOTCAMP.Array.Day17;

public class ReverseArray {
    public static void reverse(int[] a){
        int st=0;
        int end=a.length-1;
        while(st<end){
            int temp=a[st];
            a[st]=a[end];
            a[end]=temp;
            end--;
            st++;
        }
        for(int s: a){
            System.out.print(s+" ");
        }
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        reverse(a);
    }
}
