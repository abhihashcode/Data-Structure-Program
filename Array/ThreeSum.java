package Array;
import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
     int arr[]={-1,0,1,2,-1,-4};   
     Arrays.sort(arr);
     for(int i=0;i<arr.length;i++){
         int j=i+1;
         int k=arr.length-1;

         while(j<k){
            int sum=arr[j]+arr[k];
            if(sum+arr[i]==0){
                System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                j++;
                k--;
            }
            else if(sum>=arr[i])
               k--;
            else if(sum<=arr[i]){
                j++;
            }
         }
     }
    }
}
