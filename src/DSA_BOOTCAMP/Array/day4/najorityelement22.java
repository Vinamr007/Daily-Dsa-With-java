package DSA_BOOTCAMP.Array.day4;

public class najorityelement22 {
    public static void main(String[] args) {
        int[] a={1,1,2,4,5,6,1,2,4,5};
        int maxcount =0;
int majorelement=-1;
        for(int i=0;i<a.length;i++){
             int count=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }

            }
            if(count>maxcount){
                maxcount=count;
                majorelement=a[i];
            }

        }
        if(maxcount>a.length/2){
            System.out.println("majority element"+ majorelement);

        }else{
            System.out.println("no major element");
        }
    }
}
