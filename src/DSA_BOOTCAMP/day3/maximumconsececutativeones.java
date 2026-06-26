package DSA_BOOTCAMP.day3;

public class maximumconsececutativeones {
    public static void main(String[] args) {
        int[] a={1,0,1,1,0,1};
        int count=0;
        int maxcount=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                count++;
                if(count>maxcount){
                    maxcount=count;
                }
                maxcount=count;
            }if(a[i]==0){
                count=0;
            }
        }

        System.out.println(maxcount);
    }
}
