import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueueCollection {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        
        dq.offer(23);
        dq.offer(65);
        dq.offerLast(43);
        dq.offer(34);
        dq.offer(64);
        dq.offerFirst(86);
        
        System.out.println(dq);

        System.out.println(dq.peek());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        System.out.println(dq.poll());
        System.out.println("poll() \n"+dq);

        System.out.println(dq.pollFirst());
        System.out.println("pollFirst()\n "+dq);

        System.out.println(dq.pollLast());
        System.out.println("pollLast()\n "+dq);


        //Implementing Stack Using DeQueue
System.out.println("\n\nImplementing Stack Using DeQueue");
        dq.offerLast(32);
        dq.offerLast(35);
        dq.offerLast(54);
        dq.offerLast(87);
        System.out.println(dq);

        System.out.println(dq.pollLast());
        System.out.println(dq.pollLast());
        System.out.println(dq.pollLast());
        System.out.println(dq.pollLast());

    }
}
