package practice;

public class majorityelement {
    public static void main(String[] args) {
        int[] ar={1,1,2,1,3,5,1};
    int major=0;
    int count=1;
    for(int i=0;i<ar.length;i++){
        if(count==0){
            major=ar[i];
        }
        else if(major==ar[i]){
            count++;
        }
        else{
            count--;
        }
    }
        System.out.println(major);
    }
}
