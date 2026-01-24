package practice;

public class majorityelementvote {
    public static void main(String[] args) {
        int[] arr={7,7,5,7,4,1,2,7,7};
        int candidate=arr[0];
        int vote=1;
        for(int i=1;i<arr.length-1;i++){
           if(candidate==0){
               candidate=arr[i];
           } if(candidate==arr[i]){
                vote++;
            }
           else {
               vote--;
            }

        }
        System.out.println(candidate);
    }
}
