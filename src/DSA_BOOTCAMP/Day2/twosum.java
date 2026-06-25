package DSA_BOOTCAMP.Day2;

public class twosum {
    public static void main(String[] args) {
        int[] a={2,7,8,6,2,45};
        int target =9;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target){
                    System.out.println("Pair found at index: "+i+" and "+j);
                }
                break;
            }
        }

    }
}
