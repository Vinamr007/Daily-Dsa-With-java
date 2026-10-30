package DSA_BOOTCAMP.Array.Day21;

public class Monotropic {
    public static void main(String[] args) {
        int[] a={1, 2, 2, 3, 5};
        for(int i=0;i<2;i++){
            if(a[i]<a[i+1]){
                System.out.println("array iss monotropic");
           return;
            }else{
                System.out.println("array is not monotropic");
                return;
            }
        }
    }
}
