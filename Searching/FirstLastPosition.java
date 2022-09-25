public class FirstLastPosition {
    public static void main(String[] args) {
        int n[]={0,1,2,3,3,3,3,3,6,9};
        int key=3;
        System.out.println("First Occurance of "+ key +" is at index "+ firstOcc(n,10,key));
        System.out.println("Last Occurance of "+ key +" is at index "+ lastOcc(n,10,key));
    }

    public static int firstOcc(int arr[],int n,int k){
       int s=0;
       int e=n-1;
       int mid=s+(e-s)/2;
       int ans=-1;
       while(s<=e){
         if(arr[mid]==k){
           ans=mid;
           e=mid-1;
         }

         if(arr[mid]<k)
           s=mid+1;
         else 
           e=mid-1;

        mid=s+(e-s)/2;
        
       }
       return ans;
    }

    public static int lastOcc(int arr[],int n,int k){
        int s=0;
        int e=n-1;
        int mid=s+(e-s)/2;
        int ans=-1;
        while(s<=e){
          if(arr[mid]==k){
            ans=mid;
            s=mid+1;
          }
 
          if(arr[mid]<=k)
            s=mid+1;
          else 
            e=mid-1;
 
         mid=s+(e-s)/2;
         
        }
        return ans;
     }
    // public static int lastOcc(int arr[],int n,int k){
        
    // }
}
