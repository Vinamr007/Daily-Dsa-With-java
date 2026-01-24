package practice.searchh;

public class duplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,2};
        int n=arr.length;

        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate number is: "+arr[i]);
                }
            }
        }
    }
}
