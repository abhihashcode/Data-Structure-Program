import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class LinkedListCollection{
    public static void main(String[] args) {

    //    List implementtaion with LinkedList

        List <Integer> list=new LinkedList<>();

        list.add(2);
        list.add(5);
        list.add(64);
        list.add(23);

        System.out.println(list);

    // Queue implementation using linkedlist

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