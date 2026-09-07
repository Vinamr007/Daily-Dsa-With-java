package DSA_BOOTCAMP.Array.Day17;

public class LongestSubstringWithincreaseOrder {
    public static void main(String[] args) {
        int[] a={1, 2, 3, 2, 4, 5, 6};


        int maxcount=1;
        int count=1;
        for(int i=1;i<a.length;i++){

            if(a[i]>a[i-1]){
                count++;
            }else{
                count=1;
            }
            if(maxcount<count){
                maxcount=count;
            }
        }
        System.out.println(maxcount);
    }
}
