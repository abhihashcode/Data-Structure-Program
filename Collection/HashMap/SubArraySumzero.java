
import java.util.HashMap;
import java.util.Scanner;

public class SubArraySumzero{
    public static int Solution(int arr[]){
        HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
         int i=-1;
         int sum=0;
         int mxln=0;
         hmap.put(sum,i);
         HashMap<Integer,Integer> hmap=new HashMap<>();

         while(i<arr.length-1){
            i++;
            if(hmap.containsKey(sum)){
                int len=i-hmap.get(sum);
                if(len>mxln)
                  mxln=len;
            }else{
                hmap.put(sum,i);
            }
         }
        return mxln;

    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n[]={15, -2, 2, -8, 1, 7, 10, 23};
        System.out.print(Solution(n));
    }
}