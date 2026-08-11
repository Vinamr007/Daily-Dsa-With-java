package DSA_BOOTCAMP.STRINGG.Day2;

public class indexOfFirstOccurance {

    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            boolean found = true;

            for (int j = 0; j < needle.length(); j++) {

                // Compare characters of haystack and needle
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }

            // If complete needle is found
            if (found) {
                System.out.println("First occurrence at index: " + i);
                return;
            }
        }

        // Needle was not found
        System.out.println("Needle not found: -1");
    }
}