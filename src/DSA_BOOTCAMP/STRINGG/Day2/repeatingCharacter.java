package DSA_BOOTCAMP.STRINGG.Day2;

public class repeatingCharacter {
    public static void main(String[] args) {
        String str="javaishighlevelobjectorientedlanguage";
 int count=1;
 for(int i=0;i<str.length();i++){
     for (int j=i+1;j<str.length();j++){

         if(str.charAt(i)==str.charAt(j)){
             count++;
         }
     }if(count>1){
         System.out.print(str.charAt(i)+":"+count+" ,");
     }
     count=1;
 }

    }
}
