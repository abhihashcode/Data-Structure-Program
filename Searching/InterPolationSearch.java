public class InterPolationSearch {
    public static void main(String[] args) {
        int n[]={10,20,30,40,50,60,70,80,90,100};
        int key=40;
        System.out.println("First Occurance of "+ key +" is at index "+ interPolationSearch(n,10,key));
        
    }

    public static int interPolationSearch(int arr[],int n,int k){
       int s=0;
       int e=n-1;
    //    int mid=s+(e-s)/2;
       
       while(s<=e){
        int pos=s+((k-arr[s])/(arr[e]-arr[s]))*(e-s);//this is the formula for getting position

        if(arr[pos]==k)
          return pos;
        if(arr[pos]<k)
          s=pos+1;
        else
          e=pos-1;

        //   mid=s+(e-s)/2; 
       }
    return -1;
     }
    // public static int lastOcc(int arr[],int n,int k){
        
    // }
}
