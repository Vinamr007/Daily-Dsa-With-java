package DSA_BOOTCAMP.Array.day3;

public class leadervalues {
    public static void main(String[] args) {
        int[] a={16, 17, 4, 3, 5, 2};

        for(int i=0;i<a.length;i++){
            boolean isleader=true;
            for(int j=i+1;j<a.length;j++){
                if(a[j]>a[i]){
                    isleader=false;
                    break;
                }
            }
            if(isleader){
                System.out.println(a[i]);
            }
        }
    }
}
