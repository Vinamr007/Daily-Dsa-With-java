package DSA_BOOTCAMP.STRINGG;

public class ReverseString {
    public static void main(String[] args) {
        String v="vinnu";

        int left =0;
        int right=v.length()-1;

        char[] arr=v.toCharArray();

        while(left<right){
            char ch=arr[left];
            arr[left]=arr[right];
            arr[right]=ch;

            left++;
            right--;



        }
        System.out.println(arr);

    }
}
