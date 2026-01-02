package Searching;

public class DuplicateNumer {
    public void findDuplicate(int[] arr){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){

                System.out.println("Duplicate number is: "+arr[i]);}
                    count++;
                    break;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr={1,3,4,2,2};

        DuplicateNumer obj=new DuplicateNumer();
        obj.findDuplicate(arr);
    }
}
