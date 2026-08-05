package UdemyTelesko.Collectionn;

import java.util.ArrayList;

public class ArrayListt {
    public static void main(String[] args) {

        // without generics
//        ArrayList list = new ArrayList();
//
//        list.add(10);
//        list.add("Java");
//        list.add(3.14);
//
//        System.out.println(list);

        // Using generics

        ArrayList<Integer> l=new ArrayList<>();

        l.add(10);
        l.add(3);
        l.add(4);
        l.add(5);

        System.out.println("first index: "+l.getFirst());
        System.out.println("last index: "+l.getLast());
        System.out.println("value: "+l);

    }
}
