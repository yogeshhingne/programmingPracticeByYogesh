package StringPrograms;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Integer> l=new ArrayList<Integer>();
        l.add(0);
        l.add(1);
        l.add(10);
        l.add(3);
        l.add(58);
        List<Integer> l1=l.stream().filter(i->i%2==1).collect(Collectors.toList());
        System.out.println(l1);

    }

}
