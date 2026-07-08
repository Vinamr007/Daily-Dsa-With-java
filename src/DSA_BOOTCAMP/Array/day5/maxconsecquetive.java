package DSA_BOOTCAMP.Array.day5;

public class maxconsecquetive {
    public static void main(String[] args) {
        int[] a={1,1,0,1,1,1};

        int count;
        int maxcount=0;
        for(int i=0;i<a.length;i++){
            count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]!=a[j]){
                    count=0;

                }else{
                    count++;
                }
            }
            if(count>maxcount){
                maxcount=count;
            }
        }
        System.out.println(maxcount);
    }
}
