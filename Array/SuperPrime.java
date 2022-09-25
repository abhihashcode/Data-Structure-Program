package Array;

import java.util.Scanner;

public class SuperPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int []arr=new int[n];
        int k=0;
        
        for(int i=1;i<=n;i++){
            arr[k]=i;
            System.out.print(arr[k]+" ");
            k++;
        }
        System.out.println();
       int []mul=factor(n);
       int []val=new int[n];

       for(int i=0;i<arr.length;i++){
           for(int j=0;j<mul.length;j++){
               if(mul[j]==arr[i]){
                  val[i]=arr[i];
               }
           }
       }

       for(int i=0;i<val.length;i++){
           System.out.println(val[i]);
       }

    }

    static int[] factor(int n){
         int mul[]=new int[6];
         int k=1;
         for(int i=0;i<n;i++){
             mul[i]=n*k;
             k++;
         }
         return mul;
    }
}
