package DSA_BOOTCAMP.STRINGG.Day1;

public class Reverse {
    public static void main(String[] args) {
        String s="vinu";
        String rev="";

        for (int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
    }
}
