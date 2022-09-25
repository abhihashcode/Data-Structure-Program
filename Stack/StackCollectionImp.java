package Stack;

import java.util.Stack;

public class StackCollectionImp {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack();

        st.push(23);
        st.push(32);
        st.push(45);
        st.push(90);
        st.push(32);

        // for(int i=0;i<st.size();i++){
        //     System.out.println(st.pop());
        // }
        // System.out.println(st);//[23, 32, 45, 90, 32]

        System.out.println(st.peek());//32

        System.out.println(st.isEmpty());//false

        System.out.println(st.size());//5

        System.out.println(st.contains(32));//true
        
    }
}
