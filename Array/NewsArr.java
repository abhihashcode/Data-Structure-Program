package Array;

import java.util.Scanner;

public class NewsArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int k=0,temp;
       
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k++;
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
