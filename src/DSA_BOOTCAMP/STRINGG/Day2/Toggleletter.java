package DSA_BOOTCAMP.STRINGG.Day2;



public class Toggleletter {
    public static void main(String[] args) {
        String str="vInAMar";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch>='A' && ch<='Z'){
               ch=(char)(ch+32);
            }else{
                ch=(char)(ch-32);
            }
            System.out.print(ch);
        }

    }
}
