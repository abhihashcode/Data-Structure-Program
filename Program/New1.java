import java.util.Scanner;

public class New1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m,sum=0;
        for(int i=1;i<=100;i++){
            if(n==1){
               System.out.println("1");
            }else if(n==9){
                System.out.println("9");
            }else{

                if(i%9==0){
                    if(i>9){
                        for(int k=1;k<=i;k++){
                           m=k%10;
                           sum+=m;
                           k=k/10;
                        }
                        if(sum%9==0){
                            if(i==n)
                             System.out.println(sum);
                        }
                    }
                 }
            }
        }
    }
}
