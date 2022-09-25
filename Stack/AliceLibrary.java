package Stack;

import java.util.Scanner;
import java.util.Stack;

public class AliceLibrary {

    public static String revs(String str){

        String x="";

    for(int i=str.length()-1;i>=0;i--){
        x+=str.charAt(i);
    }
    return x;
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       
       Stack<String> st=new Stack();
       String x="";

       for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='/'){
            if(!x.equals(""))
              st.push(x);
              x="";
        }
        else if(str.charAt(i)=='\\'){
            String rev=revs(x);
            String temp="";

            if(!st.isEmpty()){
                temp=st.pop()+rev;
            }else{
                temp=rev;
            }
            x=temp;
        }else{
            x+=str.charAt(i);
        }
       }
       System.out.println(x);
    }
}
