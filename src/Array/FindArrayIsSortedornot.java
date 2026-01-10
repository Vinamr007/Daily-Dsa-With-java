import java.lang.reflect.Array;
import java.util.Arrays;

public class FindArrayIsSortedornot{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};

        int[] arr1=arr;

        Arrays.sort(arr);
        if(Arrays.equals(arr, arr1)){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
        
    }
}