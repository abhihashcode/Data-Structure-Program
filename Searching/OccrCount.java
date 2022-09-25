public class OccrCount {
    public static void main(String[] args) {
        int arr[]={1,2,4,4,4,5,7,7,9};
        int key=7;
        System.out.println("First Occurance of "+ key +" is at index "+ firstOcc(arr,9,key));
        System.out.println("Last Occurance of "+ key +" is at index "+ lastOcc(arr,9,key));
        int occ=(lastOcc(arr,9,key)-firstOcc(arr,9,key))+1;
        System.out.println("Occuarance of "+ key+" = "+ occ);
    }

    public static int firstOcc(int arr[],int n,int k){
        int s=0;
        int e=n-1;
        int mid = s+(e-s)/2;
        int ans=-1;
        while(s<=e){
            if(arr[mid]==k){
                ans=mid;
                s=mid-1;
            }

            if(arr[mid]<k)
              s=mid+1;
            else 
              e=mid-1;

            mid =s+(e-s)/2;
        }
    return ans;
    }

    public static int lastOcc(int arr[],int n,int k){
        int s=0;
        int e=n-1;
        int mid = s+(e-s)/2;
        int ans=-1;
        while(s<=e){
            if(arr[mid]==k){
                ans=mid;
                e=mid+1;
            }

            if(arr[mid]<=k)
              s=mid+1;
            else 
              e=mid-1;

            mid =s+(e-s)/2;
        }
    return ans;
    }
}
