package DSA_BOOTCAMP.STRINGG.Day5;

import java.util.HashSet;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        String str = "swiss";

        HashSet<Character> repeated = new HashSet<>();

        // Find repeated characters
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            for (int j = i + 1; j < str.length(); j++) {

                if (ch == str.charAt(j)) {
                    repeated.add(ch);
                    break;
                }
            }
        }

        // Find first character which is not repeated
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!repeated.contains(ch)) {
                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }

        System.out.println("No non-repeating character");
    }
}
