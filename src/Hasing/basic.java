package Hasing;

import java.util.HashSet;

public class basic {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);

        System.out.println(s);
        if (s.contains(2)) {
            System.out.println("set contains 2");
        } else {
            System.out.println("set not contains 2");
        }
 s.remove(2);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
s.clear();

    }
}
