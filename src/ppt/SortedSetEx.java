package ppt;

import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx {
    public static void main(String[] args) {
        SortedSet h = new TreeSet();
        h.add(1);
        h.add(98);
        h.add(3);
        h.add(2);
        h.add(0);
//     h.add("A");
      System.out.println(h.first());
        System.out.println(h.last());
        System.out.println(h.headSet(3));
        System.out.println(h.tailSet(2));
        System.out.println(h.subSet(1,3));
        System.out.println(h);
    }
}
