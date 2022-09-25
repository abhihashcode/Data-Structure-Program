package Array;

import java.util.HashSet;

public class Problem3 {
    public static void main(String args[]){
        int arr[]={3,34,4,12,5,2};
        int key=36;
        
        System.out.println(getValue(arr, key));
    }

    public static boolean getValue(int[] arr,int key){
        int sum=0;
        // int j=arr.length-1;
        // int i=0;
       for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            if(arr[i]+arr[j]==key)
            return true;
        }
       }
        return false;
    }
}
