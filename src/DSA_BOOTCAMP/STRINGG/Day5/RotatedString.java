package DSA_BOOTCAMP.STRINGG.Day5;

import java.util.HashSet;

public class RotatedString {
    public static void main(String[] args) {
       String str1 = "abcd";
       String str2 = "cdab";
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<str1.length();i++){
            set.add(str1.charAt(i));
        }

        for(int i=0;i<str2.length();i++){
            if(!set.contains(str2.charAt(i))){
                System.out.println("not found");
        }
    }
}}
