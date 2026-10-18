package Java_Interview_question.Interview;

public class DuplicateElemet
{
    public static void main(String[] args) {
        int[] arr={1,1,5,6,2,5,5,5,3,6,6,6,5,3,6,566,5,8,4};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }

    }
}
