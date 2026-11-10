package practice.DSA;

public class MoveZero {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        int index=0;

        int[] a=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                a[index]=arr[i];
                index++;
            }
        }

        for(int i=index;i<arr.length;i++){
            a[index]=0;

        }

        for(int i=0;i<arr.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
