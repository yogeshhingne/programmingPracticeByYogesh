package CollectionProgramPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToList {
    public static void main(String[] args) {
//        Problem
//        int []a={1,2,3,4,5};
//        ArrayList l=new ArrayList(Arrays.asList(a));
//        l.add(10);
//        l.add(11);
//        System.out.println(l);
        String []arr={"Ram","Sham","Hari"};
        ArrayList list=new ArrayList(Arrays.asList(arr));
        System.out.println(list);
//using Collections.addAll();
//        ArrayList obj=new ArrayList();
//        Collections.addAll(obj,arr);
//        System.out.println(obj);
    }
}
