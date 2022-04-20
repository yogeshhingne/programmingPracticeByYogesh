package ppt;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet h=new HashSet();
        h.add("z");
        h.add("B");
        h.add("A");
        System.out.println(h.add("A"));
        System.out.println(h);
    }
}
