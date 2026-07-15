package DSA_BOOTCAMP.Array.day10;

public class MaximunSumpair {
    public static void main(String[] args) {
        int[] a={1,8,3,6,9};
       int maxsum=Integer.MIN_VALUE;

       int first=0;
       int secomd=0;

       for(int i=0;i<a.length;i++){

           for(int j=i+1;j<a.length;j++){
               int currentsum=a[i]+a[j];

               if(currentsum> maxsum){
                   maxsum=currentsum;
                   first=a[i];
                   secomd=a[j];
               }
           }
       }
        System.out.println(first+" "+secomd);
        System.out.println(maxsum);
    }
}
