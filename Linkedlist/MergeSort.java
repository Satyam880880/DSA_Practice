class Node{
    int data;
    Node next;
     Node(int data){
        this.data = data;
        this.next = null;
     }
}
public class MergeSort {
    Node head;
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
     public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        // find mid
         Node mid = getMid(head);
        // mergeSort
      Node righthalf = mid.next;
      mid.next = null;
        // Merge
     }
    public static void main(String[] args) {
        
    }
}
