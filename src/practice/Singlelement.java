package practice;

public class Singlelement {
    public static void main(String[] args) {
        int[] arr={4,1,2,1,2};
        int target=2;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            System.out.println(i);
        }
    }
    }
}
