package String;

public class
CharacterAndOccyrance {
    public static void main(String[] args) {
        String str="programingrram";
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
