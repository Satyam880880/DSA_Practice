import java.util.*;

public class classroom {
    public static void main(String[] args) {
      HashMap<String, Integer> hm = new HashMap<>();
        hm.put("A", 1);
        hm.put("B", 2);
        hm.put("C", 3);
        hm.put("D", 4);
        hm.put("E", 5);

       // Iterating through the HashMap using forEach
       Set<String> keys = hm.keySet();
       System.out.println(keys);
       for (String k : keys){
        System.out.println("Key: " + k + ", Value: " + hm.get(k));
       }
    }
}