package Array;

import java.util.Scanner;

public class ClosePrime {
    public static void main(String[] args) {
        // Your code here
					  Scanner sc= new Scanner(System.in);
        
                      int n=sc.nextInt();
                      int ad=1;
                      for(int i=n;i>=Math.sqrt(n);i--){
                       if(prime(i)){
                           System.out.println(i);
                           break;
                       }else if(prime(n-ad)){
                           System.out.println(n-ad);
                           break;
                       }else if(prime(n+ad)){
                           System.out.println(n+ad);
                           break;
                       }
                       ad++;
                   }
              
                  }
                  static boolean prime(int n){
                      if(n<=1)
                         return false;
              
                      for(int i=2;i<=Math.sqrt(n);i++){
                          if(n%i==0)
                            return false;
                      }
              
                      return true;
                  }
    }

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
        
//         int n=sc.nextInt();


//     //    if(prime(n)){
//     //        System.out.println(n);
//     //    }else if(prime(n-1)){
//     //        System.out.println(n-1);
//     //    }else if(prime(n+1)){
//     //        System.out.println(n+1);
//     //    }

//      for(int i=n;i>=Math.sqrt(n);i--){
//          if(prime(i)){
//              System.out.println(i);
//              break;
//          }
//      }
     



//         // int[] val=new int[5];
//         // int min,near;

//         // for(int i=2;i<=n+1;i++){
//         //     int m=0;
//         //    int count=0;
//         //         for(int k=1;k<=n+1;k++){
//         //             if(i%k==0)
//         //               count++;
//         //         }
//         //     if(count==2){
//         //       val[m]=i;
//         //       System.out.println(val[m]+" ");
//         //       m++;
//         //     }
//         // if(i==n+1){
//         //         min=val[val.length-1];
//         //         near=val[val.length];
//         // }
//         // }
     
//     }

//     static boolean prime(int n){
//         if(n<=1)
//            return false;

//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i==0)
//               return false;
//         }

//         return true;
//     }
// }
