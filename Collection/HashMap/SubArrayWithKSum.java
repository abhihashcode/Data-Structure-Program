import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SubArrayWithKSum {
    public  static int sumK(int arr[]){
     HashMap<Integer,Integer> map=new HashMap<>();
     int sum=0;
     i=-1;
     map.put(i,sum);
     int len=0;

     while(i<arr.length-1){
         i++;
         if(map.containsKey(sum)==k) {
             len = Math.max(len,i - map.get(sum) + 1);
         }else{

         }
     }
     map.put(i,sum);
        return 1;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t--<0){
            String sarr[]=br.readLine().trim().split(" ");
            int n=Integer.parseInt(sarr[0]);
            int k=Integer.parseInt(sarr[1]);
            String ksrr[]=br.readLine().trim().split(" ");
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(sarr[i]);
            }
            System.out.println(sumK(arr));
        }
    }
}
