package Array;

public class FirstAndLastOccurance {
private int occurance(int[] arr,int target){
    int st=-1;
    int end=-1;
    // for first occurance
    for(int i=0;i<arr.length;i++){

            if(arr[i]==target){
                st=i;
                break;
            }

    }
    //last occurance
    for(int i=arr.length-1;i>=0;i--){
        if(arr[i]==target){
            end=i;
            break;
        }
       // System.out.println(st+" "+end);
    }
    System.out.print(st+ " "+end);


return 0;
}
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,5,5,5,5,6,75,123};
        int target=5;
        FirstAndLastOccurance f=new FirstAndLastOccurance();
        f.occurance(arr,target);
    }
}
