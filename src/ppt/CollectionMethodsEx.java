package ppt;

import java.util.*;

public class CollectionMethodsEx {
    public static void main(String[] args) {
        Collection obj = new ArrayList();
        obj.add("a");
        obj.add(1);
        obj.add("@");
      //  System.out.println(obj);
        Collection<Integer> c = Arrays.asList(2, 3, 4, 5);
        obj.addAll(c);
    System.out.println(obj);
        System.out.println("Size is " + obj.size());
      // obj.remove("@");
    // System.out.println(obj);
//  obj.removeAll(c);
//       System.out.println(obj);
//       obj.retainAll(c);
//      System.out.println(obj);

//       System.out.println(obj.contains("t"));
       System.out.println(obj.containsAll(c));
//        System.out.println(obj);
//
        Object[] a = obj.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
       obj.clear();
     System.out.println(obj);
      System.out.println(obj.isEmpty());



    }
}
