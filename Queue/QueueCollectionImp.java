package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCollectionImp {
    public static void main(String[] args) {
        
        // Queue


        // // We implementing queue with the help of linkedlist because there is no any Queue class
        // // Bascially Queue is an interface
        // // Quque works on FIFO

        // Queue <Integer> queue=new LinkedList<>();

        // // So now whatever the functions and method has linkedlist can be used by Queue

        // queue.add(34);
        // queue.add(54);
        // queue.add(32);
        // queue.add(43);
        // queue.add(37);
        
        // System.out.println(queue.remove());//34 (Which inserted first)
        // System.out.println(queue.remove());//54 (After removing 34 54 will be on the top)

        // // Now the values only have rest is below
        // System.out.println(queue);//[32, 43, 37]


        // Doubly Ended Queue


        //Here we can insert and delet from any end
        //Here dequqe is another interface which has some other functions and method
        // Example :- addFirst(),addLast(),add(),removeFirst(),removeLast().......etc.
        //its resiable interface no data restrictions

        Deque<Integer> dq=new ArrayDeque<Integer>();

       dq.add(434);
       dq.add(23);
       dq.add(89);
       System.out.println(dq);//[434, 23,89]
       dq.addFirst(56);
       dq.addLast(954);
       System.out.println(dq);//[56, 434, 23,89]

    //    System.out.println(dq.remove());//56
    //    System.out.println(dq.removeLast());//89

    System.out.println(dq.size());//5
    dq.clear();//clear all the data from deque
    System.out.println(dq);//empty
    System.out.println(dq.isEmpty());//true

    }
}
