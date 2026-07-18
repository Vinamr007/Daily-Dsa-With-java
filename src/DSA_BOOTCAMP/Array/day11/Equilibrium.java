package DSA_BOOTCAMP.Array.day11;

public class Equilibrium {
    public static void main(String[] args) {
        int[] a={1,7,3,6,5,6};

//        int leftsum=0;
//        int rightsum=0;
boolean found=false;
        for(int i=0;i<a.length;i++){
            int leftsum=0;
            int rightsum=0;
            for(int j=0;j<i;j++){
                leftsum+=a[j];
            }

            for(int j=i+1;j<a.length;j++){
                rightsum+=a[j];
            }
           if(leftsum==rightsum){
               System.out.println("Equilibrium= "+ i);
               found=true;
               break;
           }


        }

        if(!found){
            System.out.println("-1");
        }
    }
}
