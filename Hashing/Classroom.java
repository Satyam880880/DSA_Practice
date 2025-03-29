import java.util.*;

public class classroom {
    public static void main(String[] args) {
      HashMap<String, Integer> hm = new HashMap<>();
        hm.put("A", 1);
        hm.put("B", 2);
        hm.put("C", 3);
        
        System.out.println(hm);

        // get o(1)
      int res =  hm.get("A");
      System.out.println(res);

      // containsKey o(1)  --> always return boolean true & false
      System.out.println(hm.containsKey("A")); // true
        System.out.println(hm.containsKey("D")); // false

        // remove o(1)
        hm.remove("A");
        System.out.println(hm); // {B=2, C=3}

        // size o(1)
        System.out.println(hm.size()); // 2

        // isEmpty o(1)
        System.out.println(hm.isEmpty()); // false

        // clear o(1)
        hm.clear();
        System.out.println(hm); // {}
        System.out.println(hm.size()); // 0
    }
}
