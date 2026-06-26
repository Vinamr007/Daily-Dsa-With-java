package DSA_BOOTCAMP.Day2;

public class secondlargets {
    public static void main(String[] args) {
        int[] a={10, 25, 15, 30, 20};

        int seclarg=a[0];
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
    for(int i=0;i<a.length;i++){
        if(a[i]>seclarg && a[i]<max){
            seclarg=a[i];
        }
    }
        System.out.println(seclarg);

    }
}
