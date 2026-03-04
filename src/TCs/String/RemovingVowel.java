package TCs.String;

public class RemovingVowel {
    public static void main(String[] args) {
        String s="Hello World";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                continue;
            }
            System.out.print(ch);
        }
    }
}
