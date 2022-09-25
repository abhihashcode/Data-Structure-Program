public class PeekMountainArray {
    public static void main(String[] args) {
        int arr[]={0,2,1,0};
        int index=peekMountainArray(arr);
        System.out.println("Index of peek element is "+index);
        
    }
   
    public static int peekMountainArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int mid=start+(end-start)/2;

        while(start<end){
            if(arr[mid]<=arr[mid+1]){
                start=mid+1;
            }else{
                end=mid;
            }
            mid=start+(end-start)/2;
        }
        // return arr[start]; //for peek element
        return start;//for peek element index
    }
}
