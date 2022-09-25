import java.net.*;
import java.io.*;

class MyClietnt{
 public static void main(String args[]){

  try{
 Socket s=new Socket("localhost",43);
    System.out.println(s);
    DataOutputStream ds=new DataOutputStream(s.getOutputStream());
    ds.writeUTF("Hello World");
    ds.close();
   }catch(Exception e){
      System.out.println(e);
    }
 }
}