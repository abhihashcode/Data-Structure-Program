package TwoPointer;

import java.util.HashMap;
import java.util.Scanner;

public class SaranPermutations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int max=-1;
        int min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> indx=new HashMap<>();

        for(int i=0;i<n;i++){
            indx.put(arr[i],i+1);
        }

        for(int i=1;i<=n;i++){
            max=Math.max(max,indx.get(i));
            min=Math.min(min,indx.get(i));
            if(max-min+1==i){
                System.out.print(1+" ");
            }else{
                System.out.print(0+" ");
            }
        }

    }
}
