import java.util.*;
public class NineMult {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(findVal(n));
    }
    static int findVal(int n){  
        int t=9; 
         if(n==0){
             return n;
         }else if(n==1){
             return n;
         }else if(n>1){
            for(int i=1;i<=n;i++){
                 if(i==n-1){
                     t*=i;
                 }
            }
           return t;
         }else{
             return -1;
         }
    }
}
