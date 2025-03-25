import java.util.*;
public class InserHeap {
    static class heap{
      ArrayList<Integer> arr = new ArrayList<>();
      public void add(int data){
        // add  at last idx
        arr.add(data);

        int x = arr.size()-1;  // x is child idx
        int par = (x-1)/2;     // par is parent idx
        while(arr.get(x) < arr.get(par)){
            // swap
            int temp = arr.get(x);
            arr.set(x,arr.get(par));
            arr.set(par,temp);

            x = par;
            par = (x-1)/2;
        }
      }
      public int peek(){
        return arr.get(0);
      }
      // heapify
      private void heapify(int i){
       int left = 2*i+1;
       int right = 2*i+2;
       int minidx = i; // root idx minimum idx
       /* left < arr.size() -->> yah condition is liye ki ho sakta vah leaf node ho */
        if(left < arr.size() && arr.get(minidx) > arr.get(left)){  
            minidx = left;
        }
        if(right < arr.size() && arr.get(minidx) > arr.get(right)){
            minidx = right;
        }
          /* yah condition is liye kya pta 
             jo heap ho vo kharab hi nahi hua ho * agar hua ho to swap karo
           */
        if(minidx != i){  
            int temp = arr.get(i);
            arr.set(i,arr.get(minidx));
            arr.set(minidx,temp);
            /* kya pta jo mera minidx ho uske vajah 
               se dusra heap kharab hua ho then call heapify */
            heapify(minidx);
        }
      }
      public int remove(){
        int data = arr.get(0);

        // step -1 swap 1st and last node
        int temp = arr.get(0);
        arr.set(0,arr.get(arr.size()-1));
        arr.set(arr.size()-1, temp);
       
        // step -2 rempve last idx
        arr.remove(arr.size()-1);

        // step -3 heapify
        heapify(0);
        return data;
      }
      public boolean isEmpty(){
        return arr.size() == 0;
      }
    }
  public static void main(String[] args) {
    heap h = new heap();
    h.add(3);
    h.add(4);
    h.add(1);
    h.add(5);

    while(!h.isEmpty()){
        System.out.println(h.peek());
        h.remove();
    }
  }
}
