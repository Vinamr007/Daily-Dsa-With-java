package practice;

public class peakindexinginsortedarray {
    public static void main(String[] args) {
int[] arr={0,0,1,4,6,7,888,9};
int st=0,end=arr.length-1;
while(st<end){
    int mid=st+(end-st)/2;
    if(arr[mid]<arr[mid+1]){
        st=mid+1;
    }else{
        end=mid;
    }

}
        System.out.println(st);
    }
}
