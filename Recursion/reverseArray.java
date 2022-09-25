public class reverseArray {
    public static void main(String[] args) {
        int n[]={1,2,3,4,5};
        int l=n.length;

        rvereseArray(n,0,l-1);
        for(int i=0;i<l;i++){
            System.out.println(n[i]);
        }
    }
    
    static void rvereseArray(int arr[], int start, int end)
    {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        rvereseArray(arr, start+1, end-1);
    }

    // public static void swap(int n,int m){
    //     int t=n;
    //     m=t;
    //     n=m;
    // }
}
