package Stack;

public class RevereseInt {
    int top=-1;
    int stack[]=new int[10];
    int max=stack.length;

    void push(int item){
        if(top==max-1){
            System.out.println("Stack is full");
            return;
        }
        stack[top+1]=item;
        top++;
    }

    int pop(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return -1;
        }
        int n=stack[top];
        top--;
        return n;
    }


    public static void main(String[] args) {
        RevereseInt ob=new RevereseInt();
        int arr[]=new int[ob.max];
        ob.push(10);
        ob.push(20);
        ob.push(30);
        ob.push(40);
        ob.push(50);
        int k=0;
        while(ob.top!=-1){
           arr[k]=ob.pop();
           k++;
        }

        for(int i=0;i<k;i++){
            System.out.println(arr[i]);
        }

    }
}
