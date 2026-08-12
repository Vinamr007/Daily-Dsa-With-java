package DSA_BOOTCAMP.Array.day15;

public class FirstAndLastElement {
    public static void main(String[] args) {
        int[] n={5,6,7,7,8,8,8,8,9,9};

        int target=8;
        int a=n.length;
        for(int i=0; i<a-1 ;i++){
            // first occurance
            if(n[i]==target){
                System.out.println(i);
                break;
            }
        }
        for(int j=a-1;j>=0;j--){
            // last occurance
            if(n[j]==target){
                System.out.print(j);
                return;
            }
        }






//
//        for(int i=0;i<n.length;i++){
//            if(n[i]==target){
//                System.out.print(i+" ");
//                for(int j=i+1;j<n.length;j++){
//                    if(n[j]!=target){
//                        System.out.println(j-1);
//                        return;
//                    }
//                }
//            }
//        }
    }
}
