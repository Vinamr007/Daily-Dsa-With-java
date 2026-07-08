package DSA_BOOTCAMP.Array.day8;

public class equalarray {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={1,2,4};

        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                System.out.println("Arrays are not equal");
                return;
            }
        }
        System.out.println("Arrays are equal");
    }
}
