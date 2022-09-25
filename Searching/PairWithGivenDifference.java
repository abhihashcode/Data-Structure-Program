package Searching;

import java.util.Arrays;

public class PairWithGivenDifference{
    public static void main(String[] args) {
      int arr[]={5,2,3,80,20};
      int key=144;
      int f=0;
      int n=arr.length;

    // Brute Force 
    //   for(int i=0;i<arr.length;i++){
    //     for(int j=i;j<arr.length;j++){
    //         if(arr[j]-arr[i]==key){
    //             System.out.println("True");
    //             f=1;
    //         }
    //     }
    //   }

    // Optimal Solution
    // Best Case=O(1) Average Case=O(logn) worst case=O(n)
      Arrays.sort(arr); 
    int i=0;
    int j=1;
    while(i<n && j<n){
        if(arr[j]-arr[i]==key){
            System.out.println(true);
            f=1;
        }
        if(arr[j]-arr[i]<key){
            j++;
        }else{
            i++;
        }
    }
      if(f==0)
        System.out.println("False");
    }
}