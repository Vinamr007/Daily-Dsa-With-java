package InterviewSpecialQuestion;

public class ReversingString {
    public static void main(String[] args) {
        String s="vinu";
        String r="";
        for(int i=0;i<s.length();i++){
            r=s.charAt(i)+r;
        }
        System.out.println(r);
    }
}
