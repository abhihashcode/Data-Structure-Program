package Array;

import java.util.Scanner;

public class NewArr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        int [] N=new int[n];
        int target=sc.nextInt();

        for(int i=0;i<n;i++){
            N[i]=sc.nextInt();
        }
        int  count=0;

        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                 if(N[i]+N[j]==target){
                   System.out.println("["+N[i]+","+N[j]+"]");
                   count++;
                 }
            }
        }
        if(count==0){
            System.out.println("-1");
        }
    }
}
