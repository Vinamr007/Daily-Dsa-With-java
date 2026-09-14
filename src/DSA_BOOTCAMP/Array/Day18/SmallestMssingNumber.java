package DSA_BOOTCAMP.Array.Day18;

public class SmallestMssingNumber {
    public static void main(String[] args) {
        int[] a={3, 4, -1, 1};
int missing=1;

while(true){
    boolean found=false;

    for(int i=0;i<a.length;i++){
        if(a[i]== missing){
            found=true;
            break;
        }
    }
    if(!found){
        break;
    }
    missing++;
}
        System.out.println(missing);
    }
}
