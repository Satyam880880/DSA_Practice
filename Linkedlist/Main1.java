import java.util.*;

class Node{
    int data;
    Node next;
    Node prev;
    
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Main1 {
    Node head;
    // add

    public Node add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head =  newNode;
        }else{
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        }
        return head;
    }
    // print

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    /* 
    public void PairsWithGivenSum(Node head , int  target){
        Node temp = head;
    
    while(temp != null){
        Node curr = temp.next;
        while(curr != null){
            if(temp.data + curr.data == target){
                System.out.print( "("+curr.data +","+ temp.data+")");
                System.out.println(",");
            }
            curr = curr.next;
        }
        temp = temp.next;
    }
    }
    */
    public Node deleteAllOccurOfX(Node head, int x) {
        Node temp = head;
        Node dummyNode = new Node(-1);
        Node curr = dummyNode;
        while(temp != null){
            if(temp.data != x){
                Node newNode = new Node(temp.data);
                curr.next = newNode;
                newNode.prev = curr;
                curr = curr.next;
            } 
            temp = temp.next;
        }
        return dummyNode.next;
 }
// remove-duplicates-from-sorted-list
public Node removeDuplicates(Node head) {
    Node temp = head;
        Node curr = temp.next;
        while(temp != null){
          if(temp.data == curr.data){
            temp.next = curr.next;
          //  curr = temp;
          }else{
            temp = temp.next;
          }
        
        return head;
    }
    public static void main(String[] args) {
        Main1 m = new Main1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int data = sc.nextInt();
            m.add(data);
        }
        System.out.println("Doubly LinkedList  --->>>");
        m.printList(m.head);

     //   m.PairsWithGivenSum(m.head, 7);
        //m.deleteAllOccurOfX(m.head,2);
        m.head = m.deleteAllOccurOfX(m.head,2);
        System.out.println("After deleting all occurences of 2");
        m.printList(m.head);


  }
}