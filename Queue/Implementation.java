package Queue;

import java.util.Scanner;

public class Implementation {
    
    int queue[]=new int[10];
    int max=queue.length;
    int front=-1;
    int rear=-1;


    void insertQ(int item){
       if(rear==max-1){
        System.out.println("Queue is full");
        return;
       }

       if(rear==-1){
        front=rear=0;
       }else{
           rear+=1;
        }
        queue[rear]=item;
    }

    int peek(){
        if(front==-1){
          System.out.println("Queue is empty nothing is on the front of queue");
          return -1;
        }
        return queue[front];
    }

    int readQ(){
      if(front==-1){
        System.out.println("Queue is empty nothing to Read");
        return -1;
      }
      int n=queue[front];
      if(front==rear){
        front=rear=-1;
      }else{
        front=front+1;
        return n;
      }
      return -1;
    }

    void display(){
        if(front==-1){
            System.out.println("Stack is empty nothing to displayed");
            return;
        }
        for(int i=0;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Implementation q=new Implementation();
        Scanner sc = new Scanner(System.in);
        int k=0;
        while(k!=-1){
        System.out.println("=====================Queue Operations===================");
        System.out.println("=========================================================");
        System.out.println();
        System.out.println("1.Insert\n2.Delete\n3.Peek\n4.Display\n5.Exit");
        System.out.println();
        System.out.println("Enter Your Choice...........  ");
        int ch=sc.nextInt();

        switch(ch){
            case 1:
              System.out.println("\n\n Enter Number To Insert........  ");
              int item=sc.nextInt();
              q.insertQ(item);
              break;
            case 2:
               int val=q.readQ();
               if(val!=-1){
                System.out.println(val+ " Is Deleted");
               }
               break;
            case 3:
               System.out.println(q.peek());
               break;
            case 4:
               q.display();
               break;
            case 5:
                k=-1;
        }
    }
    sc.close();
  }
}

            // q.insertQ(12);
            // q.insertQ(34);
            // q.insertQ(54);
            // q.insertQ(90);
    
            // System.out.println(q.front);
            // q.display();
            // System.out.println();
            // int val=q.readQ();
            // if(val!=-1){
            //     System.out.println(val+ " Deleted From Queue");
            // }
    
            // System.out.println(q.peek());