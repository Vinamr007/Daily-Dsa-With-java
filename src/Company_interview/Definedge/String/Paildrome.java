package Company_interview.Definedge.String;

public class Paildrome {
    public static void main(String[] args) {
        String s="abcba";
        int st=0,end=s.length()-1;
        boolean palindrom=false;
        while(st<end){
            if(s.charAt(st)!=s.charAt(end)){
                palindrom=true;
                break;
            }
            st++;
            end--;
        }
        if(palindrom==true){
            System.out.println("string is not palindrome");
        }else{
            System.out.println("string is  palindrome");
        }
    }
}
