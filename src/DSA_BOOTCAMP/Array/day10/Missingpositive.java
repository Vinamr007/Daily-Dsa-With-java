package DSA_BOOTCAMP.Array.day10;

public class Missingpositive {
    public static void main(String[] args) {
        int[] a={1,1,2,2,2,3,3};
        int count=1;
        int maxstreak=1;

        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                count++;

                if(count>maxstreak){
                    maxstreak=count;
                }
            }else{
                count=1;
            }
        }
        System.out.println(maxstreak);
    }
}
