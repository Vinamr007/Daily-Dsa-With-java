package practice.searchh;

public class firstlastelememnttt {
    public static void main(String[] args) {
        int[] arr={1,2,2,2,2,3,4,5};
        int target=2;

        // first occurance
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("First occurence of "+target+" is at index: "+i);
                break;
            }
        }
        //last occurance
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==target){
                System.out.println("Last occurence of "+target+" is at index: "+i);
                break;
            }
        }
//        //first occurence
//        int first=-1;
//        int start=0;
//        int end=arr.length-1;
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if(arr[mid]==target){
//                first=mid;
//                end=mid-1;
//            }
//            else if(target>arr[mid]){
//                start=mid+1;
//            }
//            else{
//                end=mid-1;
//            }
//        }
//        System.out.println("First occurence of "+target+" is at index: "+first);
//
//        //last occurence
//        int last=-1;
//         start=0;
//         end=arr.length-1;
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if(arr[mid]==target){
//                last=mid;
//                start=mid+1;
//            }
//            else if(target>arr[mid]){
//                start=mid+1;
//            }
//            else{
//                end=mid-1;
//            }
//        }
//        System.out.println("Last occurence of "+target+" is at index: "+last);
    }
}
