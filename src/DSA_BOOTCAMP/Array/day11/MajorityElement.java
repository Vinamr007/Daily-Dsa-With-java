package DSA_BOOTCAMP.Array.day11;

public class MajorityElement {
    public static void main(String[] args) {
        int[] a={2,2,1,1,1,2,2};
        int major=a[0];
        int vote=1;
        for(int i=1;i<a.length;i++){
           if(vote==0){
               major=a[i];
           }

            else if(major==a[i]){
                vote++;
            } else {
                vote--;
            }
        }
        System.out.println(major+" "+vote);

    }
}
