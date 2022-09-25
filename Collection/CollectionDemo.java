
// Array List and List and Iterator


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class CollectionDemo{
    public static void main(String[] args) {
        // Collection<String> fruitCollection=new ArrayList<>();
        Collection<Integer> twoMul=new ArrayList<>();
        twoMul.add(2);
        twoMul.add(5);
        twoMul.add(64);
        twoMul.add(23);

        List<Integer> list=new ArrayList<>();
        list.add(45);
        list.add(234);
        list.add(32);
        list.add(23);
        list.add(232);
        list.add(254);
        // System.out.println(list);
        // list.remove(0);
        // list.remove(Integer.valueOf(232));
        // list.add(0,30);
     
        List<Integer> newList=new ArrayList<>();
        newList.add(13);
        newList.add(43);
        list.set(3, 332);
        list.addAll(newList);
        // System.out.println(list);
        // for(int i=0;i<list.size();i++){
        //     System.out.println(list.get(i)*2);
        // }
      
        Iterator<Integer> it=list.iterator();
        it.remove();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
                     
        }
       
        // twoMul.forEach(action->{
        //     System.out.println(action);
        // });
       
        // System.out.println(twoMul.getClass());
        // int i=1;
        // for(int i=1;i<=10;i++){
        // //    System.out.println(twoMul.cl);
        // }
        // fruitCollection.add("Apple");
        // fruitCollection.add("Mango");
        // fruitCollection.add("PineApple");
        // System.out.println(fruitCollection);
        // fruitCollection.remove("Mango");
        // System.out.println(fruitCollection);
        // System.out.println(fruitCollection.contains("Apple"));
        // System.out.println(fruitCollection.isEmpty());

        // fruitCollection.forEach(action ->{
        //     System.out.println(action);
        // });

        // System.out.println(fruitCollection.getClass()); //get the name of class
        // fruitCollection.clear();
        // System.out.println(fruitCollection);
        // System.out.println(fruitCollection.isEmpty());


    }
}