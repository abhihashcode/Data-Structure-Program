public class BubbleSort{
    public static void main(String[] args) {
        int arr[]={8,4,9,2,6,3};

        for(int i=0;i<arr.length;i++){
            int f=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    f=1;
                }
            }
            if(f==0){
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}