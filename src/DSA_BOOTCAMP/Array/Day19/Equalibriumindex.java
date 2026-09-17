package DSA_BOOTCAMP.Array.Day19;

public class Equalibriumindex {
    public static void main(String[] args) {
        int[] a={1, 2, 3};
        int left=0;
        int right=0;
        boolean flag=false;
        for(int i =1;i<a.length-1;i++){
            int sum=0;
            int sum1=0;

            for(int j=i-1;j>=0;j--){
                sum+=a[j];
            }

            for(int k=i+1;k<a.length;k++){
                sum1+=a[k];
            }

            if(sum==sum1){
                flag=true;
                System.out.println(i);
            }
            if(flag==false){
                System.out.println("-1");
                break;
            }
        }
    }
}
