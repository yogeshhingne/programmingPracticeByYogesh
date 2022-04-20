package CollectionProgramPractice;



import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TraverseHashSet {
    public static void main(String[] args) {
        HashSet<Integer> h= new LinkedHashSet<>();
        h.add(50);
        h.add(88);
        h.add(10);
        h.add(11);
        h.add(19);
       // Using forLoop
//        for (Integer i:h
//             ) {
//            System.out.println(i);
//
//        }
      //  using Itretor
        Iterator it=h.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
