package TCs.NumberTheory;

public class sequencefrequency {
    public static void main(String[] args) {
        String str = "ATTCGGGA";

        int count = 0;
        int maxcount = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
                if (count > maxcount) {
                    maxcount = count;
                }
            }

        }
        System.out.println(maxcount);
    }
}
