import java.util.Scanner;

public class New {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count=0;
        for(int i=1;i<n;i++){
            for(int j=1;j<=n;j++){
                if(i+j==n){
                    count++;
                }
            }
        }
    System.out.println(count);
    }
}
