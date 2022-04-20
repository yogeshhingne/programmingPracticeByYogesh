package CollectionProgramPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IsElementPresentInHashSet {
    public static void main(String[] args) {
        HashSet<String> set= new HashSet<String>();
        set.add("Ram");
        set.add("Shyam");
        set.add("Hari");
        boolean check=set.contains("Hari");
        if(check){
            System.out.println("present");
        }
        else
            System.out.println("absent");
    }
}
