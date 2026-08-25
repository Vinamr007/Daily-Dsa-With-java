package DSA_BOOTCAMP.Array.Day16;

public class SingleElementinSortedArray {
    public static int solution(int[] a){
        for(int i=0;i<a.length-1;i++){
            int count=0;

            while(a[i]==a[i]){
                count++;
                i++;
            }
            if(count>=1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
int[] a={1,1,2,3,3,4,4,8,8};
solution(a);
    }
}
