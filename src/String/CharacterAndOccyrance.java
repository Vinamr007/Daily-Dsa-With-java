package String;

public class
CharacterAndOccyrance {
//    private int charAndOccyrance(String str){
//        int count=0;
//        for (int i = 0; i < str.length(); i++) {   // picks one character
//          count = 1;
//
//            for (int j = i + 1; j < str.length(); j++) { // compares with remaining characters
//                if (str.charAt(i) == str.charAt(j)) {
//                    count++;
//                }
//            }
//
//            if (count > 1) {
//                System.out.println(str.charAt(i) + " " + count);
//            }
//        }
//
//        return 0;
//    }


    public static void main(String[] args) {
        String str="programingrram";
//        CharacterAndOccyrance c=new CharacterAndOccyrance();
//        c.charAndOccyrance(str);

        int st=0,end=str.length()-1;
int count=0;
     for(int i=st;i<=end;i++){
count=1;
         for(int j=i+1;j<=end;j++){
             if(str.charAt(i)==str.charAt(j)){
                 count++;
             }
         }
         if(count>1){
                System.out.println(str.charAt(i)+" "+count);
         }
     }
    }
}
