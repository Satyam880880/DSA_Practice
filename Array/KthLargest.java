import java.util.*;

public class KthLargest {
    public static void findkthLargest(int arr[],int k){
   PriorityQueue<Integer> pq = new PriorityQueue<>();

   for(int i=0;i<arr.length;i++){
    pq.add(arr[i]);
   }
   /* 
   while(!pq.isEmpty()){
    int res = pq.peek();
    System.out.println(res);
    pq.poll();
   }
    */
    for(int i=0;i<k;i++){
        pq.poll();
    }
    System.out.println(pq.peek());
}
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 5, 6, 4};
        int k = 6;
        findkthLargest(arr,k);
    }
}
