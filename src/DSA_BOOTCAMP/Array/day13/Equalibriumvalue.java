package DSA_BOOTCAMP.Array.day13;

public class Equalibriumvalue {

    public static void main(String[] args) {
        int[] a={1, 3, 5, 2, 2};


        for(int i=0;i<a.length;i++){


            int rightsum=0;
            int leftsum=0;


            //for left sum
            for(int j = 0;j < i; j++){
                leftsum+=a[j];
            }


            // for rightsum

            for(int k=i+1;k < a.length;k++){
                rightsum+=a[k];
            }

            if(leftsum==rightsum){
                System.out.println(a[i]);
                break;
            }

        }



    }
}
