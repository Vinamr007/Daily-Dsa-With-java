package DSA_BOOTCAMP.Array.Day19;

public class MAxdiiference {
    public static void main(String[] args) {
        int[] a={2, 3, 10, 6, 4, 8, 1};
        int dif,maxdiff=0;
        for(int i=0;i<a.length;i++){
          dif=0;
            for(int j=0;j<a.length;j++){
                if(a[i]<a[j]){
                dif=a[j]-a[i];
                }
            }
            if(dif>maxdiff){
                maxdiff=dif;
            }
        }
        System.out.println(maxdiff);
    }
}
