import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
    public static void main(String[] args) {
        Queue<String> emName=new LinkedList<>();
        
        emName.offer("Abhishek");
        emName.offer("Adarsh");
        emName.offer("Rahul");
        emName.offer("Rajiv");

        System.out.println(emName);
        System.out.println(emName.poll());//this method out the first element which is inserted first
        System.out.println(emName);
        System.out.println(emName.peek());//display which element next to out from the queue
        System.out.println(emName);
    }
}
