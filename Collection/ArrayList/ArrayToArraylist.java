import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArraylist {
    public static void main(String[] args) {
        String arr[]={"Banana","Apple","Rahul","Elephant"};

        for(String val:arr){
            System.out.println(val);
        }

        ArrayList al=new ArrayList(Arrays.asList(arr));//conert into arraylist from array
        System.out.println(al);
    }
}
