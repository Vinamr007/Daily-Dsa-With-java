package DSA_BOOTCAMP.Array.day15;

public class Sortedarray {
    public static void main(String[] args) {
        int[] a={1,3};
        int[] b={2};

        int[] c=new int[a.length+b.length];

        int i=0;
        int j=0;
        int k=0;

        for(;i<a.length &&  j<b.length;){

            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
            }else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
        for(;i<a.length;i++){
            c[k]=a[i];
            k++;
        }
        for(;j<b.length;j++){
            c[k]=b[j];
            k++;
        }

        for (int x = 0; x < c.length; x++) {
            System.out.print(c[x] + " ");
        }
    }
}

