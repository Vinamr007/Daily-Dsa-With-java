package DSA_BOOTCAMP.Array.day8;

public class thirdlarelement {
    public static void main(String[] args) {
        int[] a={10, 4, 3, 50, 23, 90};
        int n = a.length;
        if(n<=2){
            System.out.println("Invalid Input");
            
        }
        int a1=a[0];
        int a2=a[0];
        int a3=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>a1){
                a1=a[i];
            }
        }


for(int i=0;i<n;i++){
            if(a[i]>a1 && a[i]>a2){
                a1=a[i];
            }
        }


        for(int i=0;i<n;i++){
            if(a[i]>a1 && a1>a2 && a2>a3){
                a1=a[i];
            }
        }
System.out.println("Third largest element is "+a3);
    }
    
}
