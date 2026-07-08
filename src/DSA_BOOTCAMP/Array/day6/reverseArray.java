package DSA_BOOTCAMP.Array.day6;

public class reverseArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int st=0;
        int end=a.length-1;
        while(st<end){
            int temp=a[end];
            a[end]=a[st];
            a[st]=temp;
        st++;
        end--;
        }
        System.out.println("Reversed array is : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
