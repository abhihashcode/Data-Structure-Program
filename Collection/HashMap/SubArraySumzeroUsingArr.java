public class SubArraySumzeroUsingArr {
    public static int Solution(int arr[]){
        int sum=0;
        int len=0,mx=0;

        for(int i=0;i<arr.length;i++){
            sum=arr[i];
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==0){
                    len=i-j+1;
                    if(len<mx){
                      mx=len;
                    System.out.println(mx);
                    }
                }
            }
        }
        return mx;
        
    }
    public static void main(String[] args) {
        int arr[]={15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(Solution(arr));
    }
}
