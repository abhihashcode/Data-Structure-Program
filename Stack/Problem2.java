// Balanced Bracket

package Stack;

import java.util.Stack;

public class Problem2 {
     public static void main(String[] args) {
        String str="[(a+b)+{(c+d)*((e/f)}]";
        Stack <Character> st=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }else if(ch==')'){
              boolean val=handleBrackets(st,'(');
              if(val==false){
                System.out.println("False");
                return;
              }  
            }
            else if(ch=='}'){
                boolean val=handleBrackets(st,'{');
                if(val==false){
                  System.out.println("False");
                  return;
                } 
            }
            else if(ch==']'){
                boolean val=handleBrackets(st,'[');
                if(val==false){
                  System.out.println("False");
                  return;
                } 
            }
        }

        if(st.size()==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
     }    

     public static boolean handleBrackets(Stack <Character> st,char ch){
        if(st.size()==0){
           return false;
        }else if(st.peek()!=ch){
           return false;
        }else{
            st.pop();
            return true;
        }
        
     }
}
