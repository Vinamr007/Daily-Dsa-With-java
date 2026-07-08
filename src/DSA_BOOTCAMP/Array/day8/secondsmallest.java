package DSA_BOOTCAMP.Array.day8;

public class secondsmallest {
    public static void main(String[] args) {
        int[] a={10,20,5,8,15};
        int small=a[0];
        int secsmallest=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<small){
                small=a[i];
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]<secsmallest && a[i]!=small){
                secsmallest=a[i];

            }
        }
        System.out.println("second smallest element is : "+secsmallest);
    }
}
