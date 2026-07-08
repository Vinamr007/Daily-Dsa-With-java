package DSA_BOOTCAMP.Array.day5;

public class firstnonRepeatingCharacter {
    public static void main(String[] args) {
        int[] a={9, 4, 9, 6, 7, 4};
       for(int i=0;i<a.length;i++){
           int count=0;
           for(int j=0;j<a.length;j++){
               if(a[i]==a[j]){
                   count++;
               }


               }
           if(count== 1){

               System.out.println(a[i]);
               break;
           }
       }
    }
}
