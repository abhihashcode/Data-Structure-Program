package Array;

import java.io.*;
import java.util.Scanner;

public class InsertArr{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n[]=new int[5];
    int ch=0;
    InsertArr o=new InsertArr();

    while(ch!=4){
    

    System.out.println(" ******************Inserting Array Element***************** \n\n\n");
    System.out.println("1.At First Index\n2.At Last Index\n3.At Given Position\n4.Exit");
    System.out.print("Enter Your Choice..... ");
    ch=sc.nextInt();
    if(ch!=4){
    System.out.println("Enter Array Element : ");
    for(int i=0;i<n.length;i++){
        n[i]=sc.nextInt();
    }
}
    switch(ch){
        case 1:{
            o.insertAtFirst(n);
            o.printElem(n);
            break;
        }
        case 2:{
            o.insertAtLast(n);
            o.printElem(n);
            break;
        }
        case 3:{
            o.insertAtPos(n);
            o.printElem(n);
            break;
        }
        case 4:{
           System.out.println("Exiting............");
            break;
        }

    }
    // // 
    // o.insertAtPos(n);
    // // o.insertAtLast(n);
}
  }

  public void insertAtFirst(int []n){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Value For First Position : ");
    int val =sc.nextInt();
     for(int i=n.length-1;i>0;i--){
        n[i]=n[i-1];
     }
     n[0]=val;
  }

  public void printElem(int[] n){
    for(int i=0;i<n.length;i++){
        System.out.print(n[i]+" ");
    }
  }

  public void insertAtLast(int[] n){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Value For Last Position : ");
    int val =sc.nextInt();
      n[n.length-1]=val;
  }
  
  public void insertAtPos(int []n){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Position : ");
    int pos =sc.nextInt();
    System.out.println("Enter Value At Position "+pos+" : ");
    int val =sc.nextInt();
     for(int i=n.length-1;i>pos;i--){
        n[i]=n[i-1];
     }
     n[pos]=val;
  }
}

// for(int i=n.length-1;i>0;i--){
    //     n[i]=n[i-1];
    // }
    // n[0]=20;
    // n[n.length-1]=50;
    // int pos=0;
    // for(int i=n.length-1;i>pos;i--){
    //    n[i]=n[i-1];
    // }
    // n[pos]=65;