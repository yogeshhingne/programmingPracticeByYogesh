package CollectionProgramPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AddElementToHashMap {
    public static void main(String[] args) {
        HashMap<String,String> obj=new HashMap<String,String>();
        obj.put("1","Gayatri");
        obj.put("2","Reshma");
        obj.put("3","Jagruti");
        System.out.println(obj);
//        Set set=obj.entrySet();
//        Iterator itr=set.iterator();
//        while(itr.hasNext()){
//            Map.Entry entry=(Map.Entry)itr.next();
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
    }
}
