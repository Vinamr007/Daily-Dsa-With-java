package DSA_BOOTCAMP.STRINGG.Day2;

public class CountVowel {
    public static void main(String[] args) {
        String str="Vinamr";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='O' || str.charAt(i)=='U' ){
                System.out.println(str.charAt(i));
            }
        }
    }
}
