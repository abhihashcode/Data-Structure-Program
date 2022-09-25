package LinkedList;

import java.util.HashMap;

import LinkedList.Implementation.Node;

public class PairSum {
    if(head==null)
     return head;

     if(head.next==null)
       return head;

       Node cur=head;
       Node prev=null;

       while(cur.next !=head){
        prev=cur;
        cur=cur.next;
       }

       Node temp=head.next;
       Node last =cur;
       Node first=head;
       prev.next=first;
       first.next=last;
       last.next=temp;
       head=last;
       return head;
}
