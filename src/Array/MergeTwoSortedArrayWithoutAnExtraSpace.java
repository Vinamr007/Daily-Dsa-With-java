package Array;

import java.util.Arrays;

public class MergeTwoSortedArrayWithoutAnExtraSpace {
    public void swap(int[] a,int[] b){

    }
    public static void main(String[] args) {
        int[] a={1,3,5,7};
        int[] b={0,2,6,8,9};
        int n= a.length;
        int m= b.length;
int i=0;
int j=0;
int k=a.length-1;
while(i<n && j<m){
if(a[i]<b[j]){
    i++;
    continue;
}else{
    int temp=a[k];
    a[k]=b[j];
    b[j]= temp;
    k--;
    j++;
}

}
        Arrays.sort(a);
Arrays.sort(b);
        System.out.println("first array");
        for(int l=0;l<n;l++){
            System.out.print(a[l]);
        }
        System.out.println();
        System.out.println("second array");
        for(int l=0;l<n;l++){
            System.out.print(b[l]);
        }
    }
}
