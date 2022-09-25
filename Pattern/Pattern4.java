import java.util.*;

public class Pattern4 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        Pattern(N);
    }

    static void Pattern(int N){
      for(int i =0;i<=N;i++)
      {

        if(i==0){
           System.out.println("*");
           continue;
        }

        if(i==N){
            for(int j=0;j<=N;j++)
              System.out.print("*");

              continue; 
        }

        if(i==1)
         continue;

        int m=1;
        
         if(i>0 && i<N){
             for(int j=0;j<=i;j++){

                 if(j==0){
                     System.out.print("*");

                     continue;
                 }

                 if(j==i){
                     System.out.println("*");
                     continue;
                 }

                 for(int k=0;k<m;k++){
                     System.out.print("^");
                 }
             }
         }
         m++;
      }
    }
    
}
