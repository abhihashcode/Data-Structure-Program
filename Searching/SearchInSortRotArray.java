public class SearchInSortRotArray {
    public static void main(String[] args) {
        int n[]={7,9,1,2,3};
        int key=9;
        System.out.println("Element is at index "+ searchInSortRotArray(n,5,key));  
    }

    public static int findPivotElement(int arr[],int n){
        int s=0;
        int e=n-1;
        int mid=s+(e-s)/2;

        while(s<e){
            if(arr[mid]>=arr[0])
              s=mid+1;
            else
              e=mid-1;

              mid=s+(e-s)/2;
        }
        return s;
    }

    public static int binarySearch(int arr[],int start,int end,int key){
       
        // int mid=(start+end)/2;
        int mid=start+(end-start)/2;
  
        while(start<=end){
            
          if(arr[mid]==key)
            return mid;

          if(arr[mid]<key){
              start=mid+1;
          }else{
              end=mid-1;
          }

        //   mid=(start+end)/2;
        mid=start+(end-start)/2;
        }
      return -1;
      }

    public static int searchInSortRotArray(int arr[],int n,int key){
        int pivot=findPivotElement(arr,n);
        
        if(key>=arr[pivot] && key<=arr[n-1])
          return binarySearch(arr, pivot,n-1, key);
        else{
            return binarySearch(arr,0, pivot-1, key);
        }
    }
}
