package DSA_BOOTCAMP.Array.day10;

public class LongestEvenStreak {
    public static void main(String[] args) {
        int[] a={2,4,1,6,8,10,12};
        int count=0;
        int maxstreak=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                count++;
               if(count>maxstreak){
                   maxstreak=count;
               }
            }else{
                count=0;
            }
        }
        System.out.println(maxstreak);
    }
}
