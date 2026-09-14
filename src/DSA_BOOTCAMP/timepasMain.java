package DSA_BOOTCAMP;

import java.util.Arrays;

public class timepasMain {
    public static void main(String[] args) {
      int n=1324;
      int sum=0;
      int rev=0;
      while(n>0){
          rev=n%10;
          sum+=rev;
          n=n/10;
      }
        System.out.println(sum );
    }
}
