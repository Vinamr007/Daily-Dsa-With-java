package DSA_BOOTCAMP.STRINGG;

public class StringIsDigitOrString {
    public static void main(String[] args) {
        String str="12345687q";

        boolean isdigit=true;

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);

            if(!(ch >= '0' && ch <= '9')){
                isdigit=false;
                break;
            }
        } if (isdigit) {
            System.out.println("Only Digits");
        } else {
            System.out.println("Not Only Digits");
        }
    }
}
