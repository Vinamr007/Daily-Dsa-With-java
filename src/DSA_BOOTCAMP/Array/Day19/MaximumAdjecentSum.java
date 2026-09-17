package DSA_BOOTCAMP.Array.Day19;

public class MaximumAdjecentSum {
    public static void main(String[] args) {
        int[] a={3, 2, 7, 10};

        int maximum=0;

        for(int i=0;i<a.length-2;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum=a[i]+a[j];
                if(sum>maximum){
                    maximum=sum;
                }
            }
        }
        System.out.println(maximum);
    }
}
