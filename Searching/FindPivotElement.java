public class FindPivotElement {
    
    public static void main(String[] args) {
        int n[]={8,10,17,1,3};
        System.out.println("Pivot is at index "+ findPivotElement(n,5));  
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
}
