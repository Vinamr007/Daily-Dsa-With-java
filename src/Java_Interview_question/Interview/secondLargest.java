package Java_Interview_question.Interview;

import java.util.Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int[] a={5,8,9,2,58,5,4,8,5,89,98,5,7};
        Arrays.sort(a);
        System.out.println(a[a.length-2]);
    }
}
