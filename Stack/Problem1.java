
// Duplicate Brackets find if found then return true else false
package Stack;

import java.util.Stack;

public class Problem1 {
    public static void main(String[] args) {
        Stack <Character> expression=new Stack<>();

        String exp="((a+b)+((c+d)))";

        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);

            if(ch==')'){
               
                if(expression.peek()=='('){
                    System.out.println("True");
                    return;
               }

               while(expression.peek()!='('){
                  expression.pop();
               }
               expression.pop();

            }else{
                expression.push(ch);
            }
        }

        System.out.println("False");
    }
}
