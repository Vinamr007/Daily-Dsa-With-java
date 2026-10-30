package DSA_BOOTCAMP.Array.Day21;

public class SinglNumber {
    public static void main(String[] args) {
        int[] a={2, 3, 5, 4, 5, 3, 4};
        int count=0;
        for(int i=0;i<a.length-1;i++){
            count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
                if(count==2){
                    break;
                }
            }
            if(count==1){
                System.out.println(a[i]);
                return;
            }
        }
    }
}
