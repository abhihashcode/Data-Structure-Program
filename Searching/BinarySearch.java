

public class BinarySearch{
   
    public static void main(String[] args) {
       int arr[]={2,5,6,8,9,20};
       int key=6;
       int index=binarySearch(arr,6,key);
       System.out.println(key+" is found on index "+index);          
    }

    public static int binarySearch(int arr[],int n,int key){
        int start=0;
        int end=n-1;
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
  

} 