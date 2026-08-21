package DSA_BOOTCAMP.Array.Day16;

public class FIRSTnonrepeatinCharscter {
    public static void main(String[] args) {
        String str="loveleetcode";
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=i;j<str.length();j++){
                if(str.charAt(j)==str.charAt(i)){
                    count++;
                }
            }
            if(count<=1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
