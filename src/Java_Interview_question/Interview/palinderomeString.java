package Java_Interview_question.Interview;

public class palinderomeString {
    public static void main(String[] args) {
        String  str1 = "abc";

        String s1="";

        for(int i=str1.length()-1;i>=0;i--){
            s1=s1+str1.charAt(i);
        }
        if(str1.equals(s1)){
            System.out.println("palindrome String");
        }else{
            System.out.println("not palindrome String");
        }


    }
}
