package DSA_BOOTCAMP.STRINGG.Day2;

public class CountVowel {
    public static void main(String[] args) {
        String str = "banana";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean alreadyChecked = false;
            // Check if this character appeared before
            for (int j = 0; j < i; j++) {
                if (ch == str.charAt(j)) {
                    alreadyChecked = true;
                    break;
                }
            }
            // Skip if already counted
            if (alreadyChecked) {
                continue;
            }
            // Count frequency
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            System.out.println(ch + " = " + count);
        }
    }
}
