package DSA_BOOTCAMP.STRINGG.Day3;

public class CountcharcterinString {
    public static void main(String[] args) {
        String str="Hello world";
        int count=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }else{
                count++;
            }
        }
        System.out.println(count);
    }
}
