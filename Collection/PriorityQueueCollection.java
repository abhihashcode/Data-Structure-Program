import java.util.Comparator;
import java.util.PriorityQueue;

import javax.print.attribute.standard.Compression;

public class PriorityQueueCollection {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
    
        pq.offer(23);
        pq.offer(243);
        pq.offer(43);
        pq.offer(32);

        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());

    }
}
