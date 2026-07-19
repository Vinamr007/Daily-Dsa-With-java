package DSA_BOOTCAMP.Array.day11;

public class productOfAeray {
    public static void main(String[] args) {
        int[] a={1,2,3,4};


int[] result=new int[a.length];
        for(int i=0;i<a.length;i++){
            int product=1;
            for(int j=0;j<a.length;j++){
                if(i!=j){
                    product=product*a[j];

                }
            }
            result[i]=product;

        }

        for(int i=0;i<a.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
