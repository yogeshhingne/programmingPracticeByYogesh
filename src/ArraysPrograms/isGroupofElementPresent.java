package ArraysPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class isGroupofElementPresent {
    public static void main(String[] args) {
        Collection list= new ArrayList();
        list.add("Gayatri");
        list.add("Mahima");
        list.add("Madhuri");
        list.add("Ambika");
        list.add("Aarti");
        list.add("Vaishali");
        List number=Arrays.asList(1,2,3,4,5);
        list.addAll(number);
        System.out.println(list);
        boolean check=list.containsAll(number);
        if(check){
            System.out.println("present");
        }
        else
            System.out.println("absent");
    }
}
