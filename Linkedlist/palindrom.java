/* class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next = null;
    }
} 
public class palindrom {
    Node head;
       public void add(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }
        
        newNode.next = head;
        head = newNode;
       }

       public  void display(Node head){
        Node temp = head;
        while(temp != null){
           System.out.print(temp.val+ "->");
           temp = temp.next;
        }
        System.out.println("null");
       }
   
    
    public static void main(String[] args) {
        palindrom p = new palindrom();
         p.add(1);
            p.add(2);
           p.display(p.head);
    }
}
 */
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class palindrom {
    Node head;

    // Add a new node to the list
    public void add(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;  // If the list is empty, make the new node the head
        } else {
            newNode.next = head;  // Link the new node to the current head
            head = newNode;  // Move the head to the new node
        }
    }

    // Display the linked list
    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        palindrom p = new palindrom();
        p.add(1);  // Add first node
        p.add(2);  // Add second node
        p.display(p.head);  // Display the list
    }
}
