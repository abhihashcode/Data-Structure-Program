package Array;

public class ThirdLargest {
    public static void main(String[] args) {
        int arr[]={5,4,2,9,7};
        int max=arr[0];
        int max2=0;
        int max3=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<max){
                max3=max2;
                max2=max;
                max=arr[i];
            }else if(arr[i]<max2){
                max3=max2;
                max2=arr[i];
            }else if(arr[i]<max3){
                max3=arr[i];
            }
        }
        System.out.println(max3);
    }
}
