package Array;

public class Problem4{
    public static void main(String args[]){
        int arr[]={1,3,4,7,10};
        int sum=15;
        getValue(arr,sum);
    }
    public static void getValue(int arr[],int sum){
        int max=-1;
        int valSum=0;
        int val1=0;
        int val2=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                valSum=arr[i]+arr[j];
                if(valSum<=sum && arr[i]!=arr[j]){
                    if(max<=valSum){
                        max=valSum;
                        val1=arr[i];
                        val2=arr[j];       
                    }
                }
            }
        }
        System.out.println(val1+" "+val2);
    }
}