package DSA_BOOTCAMP.Array.day5;

public class MajorityofElement {
    public static void main(String[] args) {
        int[] a={2,2,1,1,1,2,2};
        int count=0;
        int candidate=a[0];
        for(int i=0;i<a.length;i++){
            if(count==0){
                candidate=a[i];
            }
            else if(a[i]==candidate){
                count++;
            }
            else {
                count--;
            }
        }
        System.out.println(candidate);
    }
}
