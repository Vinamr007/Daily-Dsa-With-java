package TCs.NumberTheory;

public class SumOfApSeries {
    public static void sumofAp(int n, int a, int d){
        int sum=0;

        for(int i=a;i<n;i++){
            int trem=a+i*d;
            sum+=trem;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sumofAp(5,1,3);
    }
}
