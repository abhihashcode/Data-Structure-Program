import java.util.HashSet;

public class Problem1{
    public static void main(String[] args) {
        
        int n=8;
        int arr[]={3,2,4,2,1,8,8,-1};
        System.out.println(getValue(arr, n));
    }

    public static boolean getValue(int arr[],int n){
        HashSet hs=new HashSet();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(hs.contains(sum) || arr[i]==0 || sum==0){
                return true;
            }
            hs.add(sum);
        }
        return false;
    }
}