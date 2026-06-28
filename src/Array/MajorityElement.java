package Array;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={7,7,5,7,4,1,2,7,7};
        int  candidate=0;
        int vote=0;
        for(int i=0;i<arr.length;i++){
            if(vote==0){
                candidate=arr[i];
vote=1;
            }
            else if (candidate==arr[i]){
                vote++;

            }
            else{
                vote--;
            }
        }
        System.out.println(candidate);
    }
}
