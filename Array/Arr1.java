package Array;
import java.util.Scanner;

public class Arr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int matrix[][] = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
          
       int sum1=0;
       int sum2=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                  sum1+=matrix[i][j];
                }
                if(i+j==n-1){
                    sum2+=matrix[i][j];
                }
            }
        }
 
      System.out.println(sum1+" "+sum2);
    }
}