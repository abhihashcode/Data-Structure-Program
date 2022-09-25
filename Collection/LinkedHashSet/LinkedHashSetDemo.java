import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo{
    public static void main(String[] args) {
        // HashSet lh=new HashSet<>();
        LinkedHashSet lh=new LinkedHashSet<>();

        lh.add(100);
        lh.add(200);
        lh.add(300);
        lh.add(400);
        lh.add(500);

        System.out.println(lh);

    }
}