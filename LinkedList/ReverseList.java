package LinkedList;

public class ReverseList {
    private int size;
    ReverseList(){
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
    Node head=null;

    void addList(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        Node curNode=head;
        
        while(curNode.next!=null){
            curNode=curNode.next;
        }
        curNode.next=newNode;
    }

    void printList(Node head){
        Node curNode=head;

        if(head==null){
            return;
        }

        while(curNode!=null){
            System.out.println(curNode.data);
            curNode=curNode.next;
        }

    }

    Node reverseList(Node head){
        Node next=null;
        Node curNode=head;
        Node prev=null;

        while(curNode!=null){
            next=curNode.next;
            curNode.next=prev;
            prev=curNode;
            curNode=next;
        }
        head=prev;
        return head;
    }

    void getMid(){
        
        if(head==null){
            System.out.println("List is Empty");
            return;
        }

        Node fast=head;
        Node slow=head;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow.data);
    }
    
    public static void main(String[] args) {
          ReverseList list = new ReverseList();

          list.addList(12);
          list.addList(34);
          list.addList(35);
          list.addList(45);

          list.printList(list.head);
          System.out.println();
          list.printList(list.reverseList(list.head));
          System.out.println();
          list.getMid();
    }
}
