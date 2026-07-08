package DSA_BOOTCAMP.Array.day8;

public class oddfind {
    public static void main(String[] args) {
        int[] a={2,7,4,9,6};
        int n1=a[0];
        int n=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                 n=a[i];
                for(int j=i+1;j<a.length;j++) {
                    if (a[j] % 2 != 0) {
                         n1 = a[j];
                    }
                if(n1>n){
                    n=n1;

                }
                }
            }
        }
        System.out.println(n);
    }
}
