import java.util.*;
public class Pattern3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // int k=0;
        for(int i=1;i<=n;i++){
            //int k=1;
            for(int j=1;j<=n-i;j++){
               System.out.print(" ");
            }
            for(int j = 1 ; j<=n;j++){
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
