package CollectionProgramPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class IterateMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Raja");
        map.put(2,"Rani");
        map.put(3,"Sony");
        Set set=map.keySet();
        //By using Iterator
        Iterator it=set.iterator();
        while(it.hasNext()){
            Integer key= (Integer) it.next();
            System.out.println("Key:"+key+" Value:"+map.get(key));
        }
        //By using for loop
        for(Integer i:map.keySet()){
            System.out.println("Key:"+i+" Value:"+map.get(i));
        }
    }
}
