package DSA_BOOTCAMP.Collection.Hashmap.Hashset;

import java.util.HashSet;

import static java.lang.StringUTF16.charAt;

public class TwoStringg {
    public static void main(String[] args) {
        String str1= "hello";
        String str2="world";


        HashSet<Character> set= new HashSet<>();

        for (int i = 0; i < str1.length(); i++) {
            set.add(str1.charAt(i));
        }

        boolean found = false;

        // Check characters of str2
        for (int i = 0; i < str2.length(); i++) {

            if (set.contains(str2.charAt(i))) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Common character exists");
        } else {
            System.out.println("No common character");
        }
    }
}
