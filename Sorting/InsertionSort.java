public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={5,1,6,2,4,3};

        for(int i=1;i<arr.length;i++){
            // int temp=arr[i];
            // int j=i;
            // while(j>0 && arr[j-1]>temp){
            //     arr[j]=arr[j-1];
            //     j-=1;
            // }
            // arr[j]=temp;
                  
                   //OR

            for(int j=0;j<i;j++){
                if(arr[j]>arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
