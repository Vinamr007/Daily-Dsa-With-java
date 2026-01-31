package DSAYOUTUBEQUESTION;

//
//Example 1:
//
//Input: s = "anagram", t = "nagaram"
//
//Output: true
//
//Example 2:
//
//Input: s = "rat", t = "car"
//
//Output: false
public class Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (char ch : s.toCharArray())
            count[ch - 'a']++;

        for (char ch : t.toCharArray())
            count[ch - 'a']++;

        for(int val: count)
            if(val!=0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";

    }
}
