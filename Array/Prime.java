package Array;

import java.io.InputStream;
import java.util.Scanner;

public class Prime {
   public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);

    int n=sc.nextInt();
    int []arr=new int[n-1];

    for(int i=0;i<n-1;i++){
        arr[i]=sc.nextInt();
    }
    
   int k=0;

    for(int i=1;i<=n;i++){
        if(arr[k]!=i){
            System.out.println(i);
            break;
        }
        k++;
    }

   }
}