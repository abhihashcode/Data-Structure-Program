package Stack;

public class LInkedLIstImp {
    private int size=0;
    LInkedLIstImp(){
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

    Node top;
    void push(int data){
        Node newNode=new Node(data);
        newNode.next=top;
        top=newNode;
    }

    int pop(){
        Node temp;
        if(top==null){
          return -1;
        }
        int n=top.data;
        temp=top;
        top=top.next;
        return n;
    }

    void display(){
        Node curNode;
        curNode=top;
        if(top==null){
            return;
        }
        while(curNode!=null){
            System.out.println(curNode.data);
            curNode=curNode.next;
        }
    }

    int peek(){
        if(top==null){
            return -1;
        }
        return top.data;
    }

    int foundIndex(int key){
        Node index;
        index=top;
        int count=0;
        if(index.data==key){
            return count;
        }
        while(index.next!=null){
            index=index.next;
            count++;
            if(index.data==key){
                return count; 
            }
        }
        return -1;
    }

    int foundVal(int ind){
        if(top==null){
            return -1;
        }
        if(ind==0){
            return top.data;
        }
        Node curNode;
        curNode=top;
        for(int i=0;i<ind;i++){
            curNode=curNode.next;
        }
        return curNode.data;
    }
    public static void main(String[] args) {
        LInkedLIstImp list = new LInkedLIstImp();
        list.push(5);
        list.push(4);
        list.push(9);
        list.push(10);
        // System.out.println(list.pop());
        // list.display();
        // System.out.println(list.pop());
        // System.out.println(list.foundIndex(10));
        System.out.println(list.foundVal(3));
    }
}
