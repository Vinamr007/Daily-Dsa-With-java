package DSA_BOOTCAMP.day4;

public class Slidingzeros {
    public static void main(String[] args) {
        int[] a={1,0,2,0,3,0,56};
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
            System.out.print(a[i]+" ");
        }
    }
}
