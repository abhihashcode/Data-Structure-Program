package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionImp {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(12);
        list.addFirst(34);
        list.addFirst(92);
        list.addFirst(35);
        System.out.println(list);//[35, 92, 34, 12]

        list.addLast(45);
        System.out.println(list);//[35, 92, 34, 12, 45]

        System.out.println(list.size());//5
        System.out.println(list.isEmpty());//false

        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next()+" -> ");
        }
        System.out.print("null");
    System.out.println();

        list.removeLast();
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.remove();
        System.out.println(list);
        list.add(34);
        System.out.println(list);
        
    }
}
