package DSA_BOOTCAMP.Array.day8;

public class firstoccurance {
    public static void main(String[] args) {
        int[] a={4,5,1,2,0,4,1,2};
        int count=0;
        for(int i=0;i<a.length;i++){
count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(a[i]);
                return;
            }
        }
    }
}
