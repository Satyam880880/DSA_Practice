
/* 
class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class ArrayToLL {
Node head;

public void insert(int data){
    Node node = new Node(data);
    if(head == null){
        head = node;
    }
    else{
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }
}
public void display(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
}
public static void main(String args[]){
    ArrayToLL obj = new ArrayToLL();
    int arr[] = {1,2,3,4,5};
    for(int i = 0; i < arr.length; i++){
        obj.insert(arr[i]);
    }
    obj.display();
}
}

*/
// oops concept used
/* 
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class ArrayToLL{
    Node head;
    public  Node arraytoll(int arr[]){
         head = new Node(arr[0]);
        Node curr = head;
        for(int i=1;i<arr.length;i++){
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }
       return head;
    }
    public  void display(){
     Node temp = head;
     while(temp != null){
        System.out.print(temp.data + "->");
        temp = temp.next;
     }
     System.out.println("null");
    }
    public static void main(String args[]){
     int arr[] = {1,2,3,4,5};
        ArrayToLL obj = new ArrayToLL();
         obj.arraytoll(arr);
        obj.display();
    }
}
  */
// Statics concept used

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class ArrayToLL{
    Node head;
    public static Node arraytoll(int arr[]){
        Node head = new Node(arr[0]);
        Node curr = head;
        for(int i=1;i<arr.length;i++){
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }
       return head;
    }
    public static void display(Node head){
     Node temp = head;
     while(temp != null){
        System.out.print(temp.data + "->");
        temp = temp.next;
     }
     System.out.println("null");
    }
    public static void main(String args[]){
     int arr[] = {1,2,3,4,5};
       // ArrayToLL obj = new ArrayToLL();
        Node result =  arraytoll(arr);
        display(result);
    }
}
