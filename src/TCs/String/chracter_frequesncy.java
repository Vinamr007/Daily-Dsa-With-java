package TCs.String;

public class chracter_frequesncy {
    public static void main(String[] args) {
      //  String s="hello world";
       // int count=0;


        String s = "hello world";

        for(int i = 0; i < s.length(); i++) {

            int count = 1;

            if(s.charAt(i) == ' ') continue;

            for(int j = i + 1; j < s.length(); j++) {

                if(s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            System.out.println(s.charAt(i) + " " + count);
        }
    }
}
