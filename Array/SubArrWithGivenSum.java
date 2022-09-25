package Array;

// public class SubArrWithGivenSum {
//     public static void main(String[] args) {
//         int arr[]={1,2,3,7,5};
//         int sum=12;
//         int n=5;
//         int f=0;
//         int num=0;
//         for(int i=0;i<n;i++){
//             if(f==1)
//                      break;
//             for(int j=0;j<n;j++){
//                 if(f==1)
//                      break;
//                 for(int k=i;k<=j;k++){
//                     num+=arr[k];
//                     if(num==sum){
//                         System.out.println((i+1)+" "+(k+1));
//                         f=1;
//                         break;
//                     }
//                 }
//            }
//             S
//         }
//     }
// }


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SubArrWithGivenSum {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long sum=sc.nextLong();
        long arr[]=new long[n];
        int num=0;
        int f=0;

        for(int i=0;i<n;i++){
           arr[i]=sc.nextLong();
        }

        for(int i=0;i<arr.length;i++){
            if(f==1){
             break;
            }
            for(int j=i;j<arr.length;j++){
                if(f==1)
                break;
                for(int k=i;k<=j;k++){
                    num+=arr[k];
                    if(num==sum){
                      System.out.print((i+1)+" "+(k+1));
                      f=1;
                      break;
                    }else if(i==n-1){
                        if(num!=sum)
                           System.out.println("-1");
                    }
                }
                num=0;
            }
        }
    }
}