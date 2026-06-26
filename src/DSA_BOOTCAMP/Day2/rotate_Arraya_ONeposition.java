package DSA_BOOTCAMP.Day2;

public class rotate_Arraya_ONeposition {
    public static void reverse(int[]a , int st, int end) {

        while (st < end) {
            int temp = a[st];
            a[st] = a[end];
            a[end] = temp;
            st++;
            end--;
        }
    }
    public static void krotate(int[]a,int k){
        k=k%a.length;
        reverse(a,0,a.length-1);
        reverse(a,0,k-1);
        reverse(a,k+1,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }


    public static void main(String[] args) {
int[] a={1,2,3,4,5};
krotate(a,2);


    }
}
