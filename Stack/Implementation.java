package Stack;

import java.util.Scanner;

public class Implementation {
    
    int stack[]=new int[10];
    int max=stack.length;
    int top=-1;

    void push(int item){
       if(top==max){
        System.out.println("Stack is full");
        return;
       }

       stack[top+1]=item;
       top++;
    }

    int peek(){
        if(top==-1){
          System.out.println("Stack is empty nothing is on the top of stack");
          return -1;
        }
        return stack[top];
    }

    int pop(){
      if(top==-1){
        System.out.println("Stack is empty nothing to pop");
        return -1;
      }
      int n=stack[top];
      top--;
      return n;
    }

    void display(){
        if(top==-1){
            System.out.println("Stack is empty nothing to displayed");
            return;
        }
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }
    }

    public static void main(String[] args) {
        Implementation stk=new Implementation();
        Scanner sc = new Scanner(System.in);
        int k=0;
        while(k!=-1){
        System.out.println("=====================Stacks Operations===================");
        System.out.println("=========================================================");
        System.out.println();
        System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit");
        System.out.println();
        System.out.println("Enter Your Choice...........  ");
        int ch=sc.nextInt();

        switch(ch){
            case 1:
              System.out.println("\n\n Enter Number To Push........  ");
              int item=sc.nextInt();
              stk.push(item);
              break;
            case 2:
               int val=stk.pop();
               if(val!=-1){
                System.out.println(val+ " Is Popped Out");
               }
               break;
            case 3:
               System.out.println(stk.peek());
               break;
            case 4:
               stk.display();
               break;
            case 5:
                k=-1;
        }
    }
  }
}
