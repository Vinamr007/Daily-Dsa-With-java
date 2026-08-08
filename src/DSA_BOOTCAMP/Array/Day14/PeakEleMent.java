package DSA_BOOTCAMP.Array.Day14;

import jdk.swing.interop.SwingInterOpUtils;

public class PeakEleMent {
    public static void main(String[] args) {
        int[] a={1,2,3,4,1,5,1,2};


        for(int i=0;i<a.length;i++){

            boolean ispeak=true;

            // cheak left neighbour
        if(i > 0 && a[i] < a[i-1]){
            ispeak=false;
        }


        // cheak rigth neighbour
            if(i<a.length-1 && a[i]< a[i+1]){
                ispeak= false;
            }
if(ispeak){
    System.out.println(" peak index "+a[i]);
    System.out.println("peak value "+i);
}


        }
    }
}
