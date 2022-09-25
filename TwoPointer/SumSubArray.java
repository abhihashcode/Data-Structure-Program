package TwoPointer;

import java.util.Scanner;

public class SumSubArray {
    public static void main(String[] args) {
    

        Scanner sc = new Scanner(System.in);

        int x=sc.nextInt();
        int y=sc.nextInt();
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();

        boolean ans1=isRight(x,y,x1,y1,x2,y2);
        boolean ans2=isRight(x+1,y,x1,y1,x2,y2);
        boolean ans3=isRight(x,y+1,x1,y1,x2,y2);
        boolean ans4=isRight(x,y,x1+1,y1,x2,y2);
        boolean ans5=isRight(x,y,x1,y1+1,x2,y2);
        boolean ans6=isRight(x,y,x1,y1,x2+1,y2);
        boolean ans7=isRight(x,y,x1,y1,x2,y2+1);

        boolean ans8=isRight(x-1,y,x1,y1,x2,y2);
        boolean ans9=isRight(x,y-1,x1,y1,x2,y2);
        boolean ans10=isRight(x,y,x1-1,y1,x2,y2);
        boolean ans11=isRight(x,y,x1,y1-1,x2,y2);
        boolean ans12=isRight(x,y,x1,y1,x2-1,y2);
        boolean ans13=isRight(x,y,x1,y1,x2,y2-1);

        if(ans1){
            System.out.println("Right");
        }else if(ans2||ans3||ans4||ans5||ans6||ans7||ans8||ans9||ans10||ans11||ans12||ans13){
            System.out.println("Special");
        }else{
            System.out.println("Simple");
        }
    }

    static boolean isRight(int x,int y,int x1,int y1,int x2,int y2){
        double a=(y1-y)*(y1-y)+(x1-x)*(x1-x);
        double b=(y2-y1)*(y2-y1)+(x2-x1)*(x2-x1);
        double c=(y2-y)*(y2-y)+(x2-x)*(x2-x);

        if(a+b==c || a+c==b || b+c==a){
            return true;
        }else{
            return false;
        }
    }
}