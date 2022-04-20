package CollectionProgramPractice;

import java.util.HashMap;

public class SizeOfHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Reshma");
        map.put(2, "Yogesh");
        map.put(3, "Gokul");
        System.out.println(map.size());
    }
}
