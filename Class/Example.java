package pack1;
import pack2.Student;

public class Example{
   public static void main(String args[]){
       Student st=new Student();
       st.setRoll(10);
       st.setName("Abhishek");
       
       System.out.println(st.getRoll+" ");
       System.out.println(st.getName);
   }
}