package ppt;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {
        public static void main(String[] args) {

            Map map=new HashMap();
            map.put(1,"Gokul");
            map.put(5,"Gobi");
            map.put(2,"Pavithra");
            map.put(6,"Sai");
            Set set=map.entrySet();
            Iterator itr=set.iterator();
            while(itr.hasNext()){
                Map.Entry entry=(Map.Entry)itr.next();
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }

