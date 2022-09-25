import java.util.HashSet;
import java.util.Iterator;

import javax.xml.transform.SourceLocator;

public class HashSetDemo{
    public static void main(String[] args) {
        // Declaration

        // HashSet hs=new HashSet<>(100);
        // HashSet hs=new HashSet<>(100,(float) 0.95);
        // HashSet <Integer> hs=new HashSet<>();

           HashSet hs= new HashSet<>();

        //    remove

           hs.add(10);
           hs.add("Abhishek");
           hs.add('A');
           hs.add(19.3);
           hs.add(null);
           hs.add(true);

           System.out.println(hs);

        //    remove

           hs.remove('A');
           System.out.println(hs);

        //    isEmpty

        System.out.println(hs.isEmpty());

        // contains

        System.out.println(hs.contains("Rahul"));
        System.out.println(hs.contains("Abhishek"));

        // Reading element

        // 1.Using for each

        for(Object val:hs){
            System.out.print(val+" ");
        }

        // 2. Using Iterator

        Iterator it =hs.iterator();
System.out.println();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}