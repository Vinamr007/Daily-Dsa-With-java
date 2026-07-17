package DSA_BOOTCAMP.Array.day11;

public class SwapNumber {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        // with using third variable
//        int temp=a;
//        a=b;
//        b=temp;

        // without thid variable

//        a=a+b;
//        b=a-b;
//        a=a-b;
//

        // in Single line

        a=a+b-(b=a);

        System.out.println(a);
        System.out.println(b);



    }
}
