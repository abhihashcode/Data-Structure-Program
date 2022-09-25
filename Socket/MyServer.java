import java.net.*;
import java.io.*;

public class MyServer{
  public static void main(String args[]){

   try{
ServerSocket sk=new ServerSocket(43);
     System.out.println("Server started");
     Socket s=sk.accept();
     System.out.println(s);
     DataInputStream di=new DataInputStream(s.getInputStream());
     String msg=(String) di.readUTF();
     System.out.println(msg);
    }catch(Exception e){
       System.out.println(e);
    }     
  }
}