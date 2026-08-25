package LeetCode;

public class MedianOftwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a=new int[nums1.length+nums2.length];

        int i=0,j=0,k=0;

        while(i<nums1.length && j<nums2.length){

            if(nums1[i] < nums2[j]){
                a[k]=nums1[i];
                i++;
            }else{
                a[k]=nums2[j];
                j++;
            }
            k++;
        }

        while(i<nums1.length){
            a[k]=nums1[i];
            i++;
            k++;
        }

        while(j< nums2.length){
            a[k]=nums2[j];
            j++;
            k++;
        }

        int n=a.length;

        if(n%2==1){
            return a[n/2];
        }else{
            return (a[n/2-1]+a[n/2])/2.0;
        }

    }

    public static void main(String[] args) {


      int[]  nums1 = {1,2};
      int[] nums2 = {3};

      findMedianSortedArrays(nums1,nums2);
    }
}
