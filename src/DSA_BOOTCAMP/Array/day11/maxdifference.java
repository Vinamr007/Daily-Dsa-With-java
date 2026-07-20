package DSA_BOOTCAMP.Array.day11;

public class maxdifference {
    public static void main(String[] args) {
        int[] a={2, 3, 10, 6, 4, 8, 1};

        int difference=0;
        int maxdiff=0;

        for(int i=0;i<a.length;i++) {

           for(int j=i+1;j<a.length;j++){
               difference=a[j]-a[i];
               if(difference>maxdiff){
                   maxdiff=difference;
               }
           }

        }
        System.out.println(maxdiff);
    }
}
