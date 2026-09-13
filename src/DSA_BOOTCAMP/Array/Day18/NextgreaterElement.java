package DSA_BOOTCAMP.Array.Day18;

public class NextgreaterElement {
    public static void main(String[] args) {
        int[] a={4, 5, 2, 10, 8};
int[] result= new int[a.length];

        for(int i=0;i<a.length;i++){
result[i]=-1;
          for(int j=i+1;j<a.length;j++){

              if(a[i]<a[j]){
                  result[i]=a[j];
                  break;
              }

          }

        }
        for(int x: result){
            System.out.print(x+" ");
        }
    }
}
