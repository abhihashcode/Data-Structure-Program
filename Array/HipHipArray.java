package Array;

import java.net.SocketPermission;
import java.util.Scanner;

public class HipHipArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] N=new int[n];
        int[] rev=new int[n];
        long sum=0,mul=1;

        for(int i=0;i<n;i++){
            N[i]=sc.nextInt();
        }
        int j=0;

        for(int i=n-1;i>=0;i--){
               rev[j]=N[i];
               System.out.print(rev[j]+" ");
               if(j<=n-1)
                j++;
              else 
                break;         
        }

        for(int i=0;i<n;i++){
            if(i%2==0){
                sum+=rev[i];
            }else{
                mul*=rev[i];
            }
        }
        System.out.println("Even & Odd Sum of Array: "+sum+" "+mul);
    }
}
