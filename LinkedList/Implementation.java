package LinkedList;

public class Implementation {

    private int size;
    Implementation(){
        size=0;
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }      
        
    }

    Node head;

    // Reverse
  
    Node Reverse(){
        Node prev=null;
        Node curNode=head;

        while(curNode!=null){
            Node n=curNode.next;

            curNode.next=prev;

            prev=curNode;
            curNode=n;
        }
        head=prev;
        return head;
    }

    // Add First

    public void AddFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    // Add Last

    public void AddLast(int data){
        Node newNode=new Node(data);
        Node curNode=head;
        if(head==null){
            head=newNode;
            return;
        }

        while(curNode.next!=null){
            curNode=curNode.next;
        }

        curNode.next=newNode;
    }

// Print

    void printList(Node head){
        Node currNode=head;
        if(head==null){
            System.out.println("List Is Empty");
            return;
        }

        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.print("null");
        System.out.println();
    }

// Delete First

    void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        size--;
    }

    // Delete Last

    void deleteLast(){
        
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
         head=null;   
        }

        Node secondNode=head;
        Node lNode=head.next;
        
       
        while(lNode.next!=null){
            lNode=lNode.next;
            secondNode=secondNode.next;
        }
        secondNode.next=null; 
    }
    
// Return Size

    public int size(){
        return size;
    }

    // check is empty or not

    public boolean isEmpty(){
        if(size==0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Implementation list = new Implementation();
 
        list.AddFirst(23);
        list.AddFirst(34);
        list.AddFirst(23);
        list.AddFirst(30);
        list.printList(list.head);
        list.AddLast(3);
        list.AddLast(4);
        // list.deleteFirst();
        // list.printList(list.head);
        // System.out.println(list.size());
        // System.out.println(list.isEmpty());
        // list.deleteFirst();
        // list.deleteFirst();
        // list.printList(list.head);
        // list.deleteLast();
        list.printList(list.head);
        // System.out.println(list.size());
        list.printList(list.Reverse());
    }
}