package DSA_BOOTCAMP.Array.day13;

public class Duplicateelement {
    public static void main(String[] args) {
        int[] a={4,3,2,7,8,2,3,1};
        int count;

        for(int i=0;i<a.length;i++){
            count=1;
            for(int j=i+1;j<a.length;j++){

                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count>1){
                System.out.print(a[i]+" ");
            }
        }
    }
}
