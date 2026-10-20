package UdemyTelesko.Dsa.Searching;

public class LinearSearching {
    public static void Linearsearch(int[] a,int n){
        for(int i=0;i<a.length;i++){
            if(a[i]==n){
                System.out.println("element at position of  "+i);
            }
        }
    }


    public static void main(String[] args) {
        int[] a={1,2,3,4,5,9,7,6,5,9,2,8,2,6596  };
        int n=6;
        Linearsearch(a,n);
    }
}
