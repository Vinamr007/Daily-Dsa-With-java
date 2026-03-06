package TCs.NumberTheory;

public class primenumfCtor {
    public static void main(String[] args) {
        int n=60;

        for(int i=2;i<=n;i++){
            while(n%i==0){
                System.out.print(i+ " ");
                n=n/i;
            }
        }
    }
}
