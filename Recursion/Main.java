import java.io.*; // for handling input/output
import java.lang.reflect.Array;
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

       int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                   if((arr[i] - arr[j] <= p) && (arr[i] - arr[k] <= p) && (arr[j] - arr[k] <= p)){
                      count++;
                   }else{
                    count--;
                   }
                }
            }
        }

        System.out.println(count);

        
    }
}