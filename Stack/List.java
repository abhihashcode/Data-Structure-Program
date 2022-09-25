package Stack;

public class List {
        // int max=5;
        // int top=-1;
        // int arr[]=new int[5];
        
        // void push(int item){
        //   if(top==max-1){
        //     System.out.println("Stack is full");
        //     return;
        //   }
    
        //   arr[top+1]=item;
        //   top++;
        // }
        
        // int pop(){
        //     if(top==-1){
        //      System.out.println("Stack Underflow");
        //      return -1;
        //     }
        //     int n=arr[top];
        //     top--;
        //     return n;
        // }
        
        // void display(){
        //     for(int i=0;i<arr.length-1;i++){
        //   System.out.print(arr[i]+" ");
        //     }
        // }
        
        // int peek(){
        //     if(top==-1){
        //         System.out.println("Stack Underflow");
        //         return -1;
        //     }
        //     return arr[top];
        // }
        
        private int size=0;
        List(){
           size=0;
        }
        class Node{
            int data;
            Node next;
            Node(int data){
               this.data=data;
               this.next=null;
               size++;
            }
        }
    
        Node top;
        void push(int data){
            Node newNode=new Node(data);
            newNode.next=top;
            top=newNode;
        }
    
        int pop(){
            Node temp;
            if(top==null){
              return -1;
            }
            int n=top.data;
            temp=top;
            top=top.next;
            return n;
        }
    
        void display(){
            Node curNode;
            curNode=top;
            if(top==null){
                return;
            }
            while(curNode!=null){
                System.out.print(curNode.data+"");
                curNode=curNode.next;
            }
        }
    
        int peek(){
            if(top==null){
                return -1;
            }
            return top.data;
        }
    
        int foundIndex(int key){
            Node index;
            index=top;
            int count=0;
            if(index.data==key){
                return count;
            }
            while(index.next!=null){
                index=index.next;
                count++;
                if(index.data==key){
                    return count; 
                }
            }
            return -1;
        }
    
        int foundVal(int ind){
            if(top==null){
                return -1;
            }
            if(ind==0){
                return top.data;
            }
            Node curNode;
            curNode=top;
            for(int i=0;i<ind;i++){
                curNode=curNode.next;
            }
            return curNode.data;
        }
        
        public static void main(String[] args) {
            List list = new List();
            
           
            
          
            
          
            
            
            list.push(6);
            list.push(6);
            list.push(6);
            list.push(9);
            list.push(1);
            list.push(1);
            list.push(9);
            list.push(1);
            list.push(1);
            list.push(9);
            // System.out.println(list.pop());
            System.out.println("Mansi Ji Ka Number =");
            list.display();
            // System.out.println(list.pop());
            // System.out.println(list.foundIndex(10));
            System.out.println("\n"+list.foundVal(2));
        }
    }