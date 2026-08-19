package DSA_BOOTCAMP.STRINGG.Day4;

public class Nonrepeatingchar {
    public static void main(String[] args) {
        String str="swiss";
  int count;
        for(int i=0;i<str.length();i++) {
            count=0;
            for(int j=0;j<str.length();j++) {
                if(str.charAt(i)==str.charAt(j)) {
                    count++;
                }
            }
            if(count<=1){
                System.out.println(str.charAt(i));
                return;
            }
        }
    }
}
