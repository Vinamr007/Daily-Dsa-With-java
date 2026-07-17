package DSA_BOOTCAMP.STRINGG.Day1;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if(s1.length()!=s2.length()){
            System.out.println(" not anagram");
            return ;
        }

        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b)){
            System.out.println(" anagram");
        }
        else{
            System.out.println(" not anagram");
        }



    }
}
