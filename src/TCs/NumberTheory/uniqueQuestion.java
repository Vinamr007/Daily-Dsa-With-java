package TCs.NumberTheory;

public class uniqueQuestion {
    public static void unique(int n){
      //  int d=0;
        while( n!=1){
            if(n%2==1){
               n=n*3+1;

            }else{
               n=n/2;

            }
            System.out.print(n+ " " );
        }
        //System.out.println(d);
    }
    public static void main(String[] args) {
        int n=13;

unique(n);
    }
}
