import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo1{
    public static void main(String[] args) {
        ArrayList al =new ArrayList();
        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");

        // System.out.println(al);

        ArrayList al_dup=new ArrayList();

        // addAll()

        al_dup.addAll(al);
        System.out.println(al_dup);

        // removeAll()

        al_dup.removeAll(al_dup);
        System.out.println(al_dup);

        // Sorting Arraylist

        System.out.println(al);
        Collections.sort(al);//Ascending Order
        System.out.println(al);

        Collections.sort(al,Collections.reverseOrder());//Descending Order
        System.out.println(al);

        // Shuffling 
        System.out.println(al);
        Collections.shuffle(al);
        System.out.println(al);
        // Collections.shuffle(al);
        // System.out.println(al);

    }
}