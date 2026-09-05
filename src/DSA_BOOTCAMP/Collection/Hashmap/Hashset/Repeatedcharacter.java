package DSA_BOOTCAMP.Collection.Hashmap.Hashset;

import java.util.HashSet;

public class Repeatedcharacter {
    public static void main(String[] args) {
        String str = "abca";

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (set.contains(ch)) {
                System.out.println("First repeated character: " + ch);
                return;
            }

            set.add(ch);
        }

        System.out.println("No repeated character");

    }
}
