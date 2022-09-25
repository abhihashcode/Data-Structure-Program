public class NewP {
    public static void main(String[] args) {
        int i=1;
        printNum(i);
    }

    public static void printNum(int i){
        if(i>6)
           return;
        System.out.println(i);
        printNum(i+1);
    }
}
