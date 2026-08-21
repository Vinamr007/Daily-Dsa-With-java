package DSA_BOOTCAMP.Array.Day16;

public class SearchSortedarray {

    public static void Sorted(int[] a,int target){
for(int i=0;i<a.length;i++){
    if(a[i]==target){
        System.out.println(i);
    }
}
    }


    public static void main(String[] args) {
        int[] a={4,5,6,7,0,1,2};
        int target=0;
Sorted(a,target);
    }
}
