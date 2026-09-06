package DSA_BOOTCAMP.Collection.Hashmap.Hashset;

import java.util.HashSet;

public class FirstRepeatingCharcter {
    public static void main(String[] args) {
        String s= "swiss";

        HashSet<Character> unique = new HashSet<>();
        HashSet<Character> repeated = new HashSet<>();

        // Find repeated characters
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (unique.contains(ch)) {
                repeated.add(ch);
            } else {
                unique.add(ch);
            }
        }

        // Find first character which is not repeated
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!repeated.contains(ch)) {
                System.out.println(ch);
                break;
            }
        }



    }
}
