package DSA_BOOTCAMP.Array.Day16;

public class SearchSortedarray {

    public static void Sorted(int[] a,int target){
for(int i=0;i<a.length;i++){
    if(a[i]==target){
        System.out.println(i);
    }
}
    }

//    public static void Sorted(int[] a,int target){
//        int st=0,end= a.length-1;
//        while(st<=end){
//            int mid=st+(end-st)/2;
//            if(a[mid]==target){
//                System.out.println(mid);
//                return;
//            }else if(a[mid]>target){
//                end=mid-1;
//            }else{
//                st=mid+1;
//            }
//        }
//        System.out.println("not found");
//    }
    public static void main(String[] args) {
        int[] a={1, 2, 3, 4, 5, 6, 7};
        int target=0;
Sorted(a,target);
    }
}
