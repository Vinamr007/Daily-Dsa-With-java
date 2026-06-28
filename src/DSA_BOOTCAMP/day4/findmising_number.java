package DSA_BOOTCAMP.day4;

public class findmising_number
{
    public static void main(String[] args) {
        int[] a={1,0,3};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        int n=a.length;
        int actualsmu=n*(n+1)/2;

        int missing=actualsmu-sum;
        System.out.println(missing);
    }
}
