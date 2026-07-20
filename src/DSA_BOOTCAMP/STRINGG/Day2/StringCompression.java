package DSA_BOOTCAMP.STRINGG.Day2;

public class StringCompression {
    public static void main(String[] args) {
        String str="aaaabbcccc";
 char ch=str.charAt(0);
 int count=0;

 for(int i=1;i<str.length();i++){
     if(ch==str.charAt(i)){
         count++;
     }else{
         System.out.println(ch);
              if(count>1){
             System.out.print(count);
                          }
         ch=str.charAt(i);
         count=1;
     }
 }
        if (count > 1) {
            System.out.print(count);
        }
    }
}
