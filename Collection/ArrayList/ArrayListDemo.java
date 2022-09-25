import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo{
    public static void main(String[] args) {
        // Declaration

        // ArrayList al=new ArrayList();
        // ArrayList <Integer> al=new ArrayList<Integer>();
        // ArrayList <String> al=new ArrayList<String>();
        // List al=new ArrayList();

        ArrayList al=new ArrayList();

        // Adding new ELement

        al.add(4);
        al.add("Abhishek");
        al.add("A");
        al.add(15.5);
        al.add(true);

        System.out.println(al);

        // Size
        System.out.println(al.size());
        
        //remove
        al.remove(15.5); //or al.remove(3);
        System.out.println(al); 

        // Insert a new element at particular index
        al.add(1,"Rahul");
        System.out.println(al);

        // Retrieve Specific Element
        System.out.println(al.get(3));
    
        // Replacing or Update element
        al.set(2,471);
        System.out.println(al);

        // Searching in arraylist
        System.out.println(al.contains(4));
        System.out.println(al.contains(43));

        // isEmpty()
        System.out.println(al.isEmpty());

        // Reading arraylist by loop

        // For loop

        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }

        // Using for each loop
        System.out.println();
        for(Object e:al){
            System.out.print(e+" ");
        }

System.out.println();
        // Using Iterator
        Iterator it= (Iterator) al.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}