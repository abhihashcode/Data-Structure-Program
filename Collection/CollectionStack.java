import java.util.Stack;

public class CollectionStack {
    public static void main(String[] args) {
        Stack<String> animals=new Stack<>();

        animals.push("Horse");
        animals.push("Lion");
        animals.push("Goat");
        animals.push("Dog");
        // animals.forEach(action->{
        //     System.out.println(action);
        // });
        // animals.add(2,"Cow");
        System.out.println(animals);
        // System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals);
        System.out.println(animals.peek());


    }
}
