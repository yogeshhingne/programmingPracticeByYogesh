package CollectionProgramPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        //System.out.println(list.toArray());
        for(Integer i:list){
            System.out.println(i);
        }

    }
}
