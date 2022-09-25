package Searching;

public class FindFirstandLast {
    public static void main(String[] args) {

        int arr[]={2,4,5,5,5,6,7,8,8,8,9};
        int j=arr.length-1;
        int key=4;
        int i=0;

        // Linear Search

        // while(i<=j){
        //     if(arr[i]==key && arr[j]==key){
        //         System.out.println("First Index :"+i+"\nLast Index :"+j);
        //         i=j+1;
        //     }else if(arr[i]<key){
        //         i++;
        //     }else{
        //         j--;
        //     }
        // }

        // Binary Search

        int mid=i+(j-i)/2;

        while(i<=j){
           if(arr[mid]<key){
              
           }
        }
    }
}
