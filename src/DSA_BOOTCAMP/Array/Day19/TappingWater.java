package DSA_BOOTCAMP.Array.Day19;

public class TappingWater {
    public static void main(String[] args) {
        int[] a = {3, 0, 2, 0, 4};

        int totalwater=0;

        for(int i=0;i<a.length;i++){

            int leftmax=a[i];
            int rightmax=a[i];

            // find maximum heigth of right side
            for(int j=0;j< i;j++){
                if(a[j]>leftmax){
                    leftmax=a[j];
                }
            }

            // find maximum heigth on rigth side
            for(int j=i+1;j<a.length;j++){
                if(a[j]>rightmax){
                    rightmax=a[j];
                }
            }
            //water that can be stored at current position
            int water=Math.min(leftmax,rightmax)-a[i];
            totalwater+=water;
        }
        System.out.println(totalwater);
    }
}
