package DSA_BOOTCAMP.Array.Day18;

public class RearrangeBysign {
    public static void main(String[] args) {
        int[] a={3, 1, -2, -5, 2, -4};

    int[] b=new int[a.length];

int positiveindex=0;
int negativeindex=1;

for(int i=0;i<a.length;i++){
    if(a[i]>0){
        b[positiveindex]=a[i];
        positiveindex+=2;
    }else{
        b[negativeindex]=a[i];
    negativeindex+=2;
    }
}
for(int x: b){
    System.out.print(x+" ");
}
    }
}
