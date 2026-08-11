package DSA_BOOTCAMP.STRINGG;

public class LengthOfLastword {
    public static void main(String[] args) {

        String str=" hello world my name is moon";
       int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count=0;
            }else{
                count++;
            }

        }
        System.out.println(count);
    }
}
