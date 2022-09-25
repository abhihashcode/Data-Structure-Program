import java.util.*;
public class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();

        calculateMarks(P,Q,R);
    }

    static void calculateMarks(int P,int Q,int R){
         int marks=(P*4)+(Q*(-2))+(R*(-1));
         System.out.println(marks);
    }
}
