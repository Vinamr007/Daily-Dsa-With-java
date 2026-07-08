package DSA_BOOTCAMP.Array.day8;

public class leaderofarray {
    public static void main(String[] args) {
        int[] a={16,17,4,3,5,2};
        for(int i=1;i<a.length-1;i++){
           for(int j=i+1;j<a.length-1;j++){
               if(a[i]>a[j]){
                   System.out.println(a[i]);
               }
           }
        }
    }
}
