package InterviewSpecialQuestion;

public class duplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,5,1,6,3};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("duplicate element is: "+arr[i]);
                }
            }
        }

    }
}
