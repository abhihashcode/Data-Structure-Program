package Array;
import java.util.*;
import java.io.*;

public class DeleteArr {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int n[]={5,6,7,23,65,6,3};
        sortElem(n);
        int count=0;
         for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[i]==n[j]){
                    for(int k=i;k<n.length-2;k++){
                        n[k]=n[k+2];
                         count=1;
                    }
                    break;
                }
                if(count==1)
                   break;
            }
         }

         for(int i=0;i<n.length-2;i++){
            System.out.println(n[i]);
         }
    }

    public static void sortElem(int n[]){
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[i]>=n[j]){
                   int t=n[i];
                   n[i]=n[j];
                   n[j]=t;
                }
            }
        }
    }
}












        // int delElm=65;
        // for(int i=0;i<n.length;i++){
        //     if(n[i]==delElm){
        //         for(int j=i;j<n.length-1;j++){
        //             n[j]=n[j+1];
        //         }
        //         break;
        //     }
        // }
        // for(int i=0;i<n.length-1;i++){
        //     System.out.println(n[i]);
        // }
    //     int ch=0;
    //     DeleteArr o=new DeleteArr();
    
    //     while(ch!=4){
        
    
    //     System.out.println(" ******************Inserting Array Element***************** \n\n\n");
    //     System.out.println("1.At First Index\n2.At Last Index\n3.At Given Position\n4.Exit");
    //     System.out.print("Enter Your Choice..... ");
    //     ch=sc.nextInt();
    //     if(ch!=4){
    //     System.out.println("Enter Array Element : ");
    //     for(int i=0;i<n.length;i++){
    //         n[i]=sc.nextInt();
    //     }
    // }
    //     switch(ch){
    //         case 1:{
    //             o.insertAtFirst(n);
    //             o.printElem(n);
    //             break;
    //         }
    //         case 2:{
    //             o.insertAtLast(n);
    //             o.printElem(n);
    //             break;
    //         }
    //         case 3:{
    //             o.insertAtPos(n);
    //             o.printElem(n);
    //             break;
    //         }
    //         case 4:{
    //            System.out.println("Exiting............");
    //             break;
    //         }
    
    //     }
    //     // // 
    //     // o.insertAtPos(n);
    //     // // o.insertAtLast(n);
    // }
    //   }
    
    //   public void insertAtFirst(int []n){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter Value For First Position : ");
    //     int val =sc.nextInt();
    //      for(int i=n.length-1;i>0;i--){
    //         n[i]=n[i-1];
    //      }
    //      n[0]=val;
    //   }
    
    //   public void printElem(int[] n){
    //     for(int i=0;i<n.length;i++){
    //         System.out.print(n[i]+" ");
    //     }
    //   }
    
    //   public void insertAtLast(int[] n){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter Value For Last Position : ");
    //     int val =sc.nextInt();
    //       n[n.length-1]=val;
    //   }
      
    //   public void insertAtPos(int []n){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter Position : ");
    //     int pos =sc.nextInt();
    //     System.out.println("Enter Value At Position "+pos+" : ");
    //     int val =sc.nextInt();
    //      for(int i=n.length-1;i>pos;i--){
    //         n[i]=n[i-1];
    //      }
    //      n[pos]=val;
