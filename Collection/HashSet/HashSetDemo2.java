import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet set1=new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
 
        System.out.println(set1);  

        HashSet set2=new HashSet<>();

        set2.add(3);
        set2.add(4);
        set2.add(5);
        // set2.add(6);
 
        System.out.println(set2);
        
        // Union

        // set1.addAll(set2);
        // System.out.println(set1);

        // Intersection
        
        // set1.retainAll(set2);
        // System.out.println(set1);

        // Difference

        // set1.removeAll(set2);
        // System.out.println(set1);

        // Subset

        System.out.println(set1.containsAll(set2));
      }
}
