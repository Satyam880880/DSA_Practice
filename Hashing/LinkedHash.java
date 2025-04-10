import java.util.*;

public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        hm.put("A", 1);
        hm.put("B", 2);
        hm.put("C", 3);
        hm.put("D", 4);
        hm.put("D", 4); // Duplicate key, value will be overwritten

        System.out.println("LinkedHashMap: " + hm);
        System.out.println("Size: " + hm.size());

        //TreeMap
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("A", 1);
        tm.put("B", 2);
        tm.put("C", 3);
        tm.put("L", 4);
        tm.put("D", 0);
        System.out.println("TreeMap: " + tm);
    }
    
}
