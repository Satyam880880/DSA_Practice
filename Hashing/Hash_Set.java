import java.util.*;
 
/* 
public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
         hs.add(1);
         hs.add(5);
         hs.add(1);
         hs.add(7);
         hs.add(2);
         hs.add(2);
         System.out.println(hs);

         hs.remove(1);
         if(hs.contains(1)){
            System.out.println("exist value ");
         }else{
            System.out.println("value does not exist");
         }

         hs.clear();
         System.out.println(hs.size()); // 0

         System.out.println(hs.isEmpty()); 
    }
}


*/

// Using Iterators

public class Hash_Set {
    public static void main(String[] args) {
       HashSet<String> city = new HashSet<>();
         city.add("Mumbai");
         city.add("kanpur");
         city.add("kolkata");
         city.add("JAUNPUR");
         city.add("up");
         city.add("up");

         /* 
         Iterator it = city.iterator();
         while(it.hasNext()){
            System.out.println(it.next());
         }

         */

         for(String x: city){
            System.out.println(x);
         }

         LinkedHashSet<String> lhs = new LinkedHashSet<>();
         lhs.add("Mumbai");
         lhs.add("kanpur");
         lhs.add("kolkata");
         lhs.add("JAUNPUR");
         lhs.add("up");
         lhs.add("up");
         System.out.println(lhs);

         lhs.remove("kanpur");
         System.out.println(lhs);

         // TreeSet

         TreeSet<String> ts = new TreeSet<>();
         ts.add("Mumbai");
         ts.add("kanpur");
         ts.add("kolkata");
         ts.add("JAUNPUR");
         ts.add("up");
         ts.add("up");
         System.out.println(ts);

    }
}