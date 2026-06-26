package DSA_BOOTCAMP.Day2;

public class replaceZero {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 12};
int index=0;
       for(int i=0;i<a.length;i++){
           if(a[i]!=0){
               a[index]=a[i];
               index++;
           }
       }

       for(int i=index;i<a.length;i++){
           a[i]=0;
       }


        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}