package Stack;

import java.util.Scanner;
import java.util.Stack;

public class FifaFever {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            int p=sc.nextInt();
            int q=sc.nextInt();

            Stack <Integer> stt=new Stack<>();

            stt.push(q);
            int old=-1;
            for(int j=0;j<p;j++){
                String pp=sc.next();
                if(pp.charAt(0)=='P'){
                    int playerid=sc.nextInt();
                    stt.push(playerid);
                    old=-1;
                }else{
                    if(old==-1 || old==0){
                        old=stt.pop();
                        if(stt.isEmpty()){
                            stt.push(0);
                            old=0;
                            continue;
                        }
                    }else{
                        stt.push(old);
                        old=-1;
                    }
                }
            }

            System.out.println(stt.peek());
            
        }
    }
}
