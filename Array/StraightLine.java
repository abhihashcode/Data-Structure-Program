package Array;

public class StraightLine {
    public static void main(String[] args) {
        int arr[][]={{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        int n=arr.length;
        int m=arr[0].length;
        System.out.println(FindStraightLine(arr,n,m));
    }
    public static int FindStraightLine(int arr[][],int n,int m){
        int count=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               int sum=arr[i][j]+arr[j][i];
               System.out.println(sum);
            }
        }

        return count;
    }
}
