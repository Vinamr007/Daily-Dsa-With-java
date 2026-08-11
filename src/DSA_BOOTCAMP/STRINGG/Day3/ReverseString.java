package DSA_BOOTCAMP.STRINGG.Day3;

public class ReverseString {
    public static void main(String[] args) {

        String str="vinamr";
        String dtr1="";

        for(int i=str.length()-1;i>=0;i--){
            dtr1=dtr1+str.charAt(i);
        }
        System.out.println(dtr1);
    }
}
