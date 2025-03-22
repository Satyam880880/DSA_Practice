import java.util.Comparator;
import java.util.PriorityQueue;

public class Classroom {
    public static void main(String[] args) {
       // PriorityQueue<Integer> pq = new PriorityQueue<>();
       
       /*
        * Priority queue ko ham jis order main insert kare par value
          hamesa accending order main print hoga
        */
         // reverse Order
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
            pq.add(7);
            pq.add(3);
            pq.add(1);
            pq.add(9);
            while (!pq.isEmpty()){
                System.out.println(pq.peek());
                pq.remove();
            }
    }
}
