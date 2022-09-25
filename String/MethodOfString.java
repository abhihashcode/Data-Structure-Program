package String;

public class MethodOfString {
    public static void main(String[] args) {
       String s="This is demo";
       System.out.println(s.substring(3));//s is demo
       System.out.println(s.substring(3,11)); //s is dem

       System.out.println(s.subSequence(3,9));//s is d  

       System.out.println(s.replace("is","was"));

       System.out.println(s.replaceFirst("is","was"));
       System.out.println(s.replaceFirst("is(.)","was"));
       System.out.println(s.replaceFirst("is(.*)", "was"));
       
      //  System.out.println(s.replaceAll("is","was"));
      //  System.out.println(s.replaceAll("is(.)","was"));
      //  System.out.println(s.replaceAll("is(.*)", "was"));

       System.out.println(s.contains("t"));//false
       System.out.println(s.contains("T"));//true

       System.out.println(s.startsWith("T"));//true
       System.out.println(s.startsWith("l"));//false


       System.out.println(s.endsWith("o"));//true
       System.out.println(s.endsWith("l"));//false

       
       System.out.println(s.indexOf("T"));//0
       System.out.println(s.indexOf("l"));//-1

       
       System.out.println(s.lastIndexOf("T"));//0
       System.out.println(s.lastIndexOf("d"));//8


       System.out.println(s.charAt(3));//s
    //    System.out.println(s.charAt(-1));//java.lang.StringIndexOutOfBoundsException

       System.out.println(s.toUpperCase());//THIS IS DEMO
       System.out.println(s.toLowerCase());//this is demo
 
       int a=10,b=20;
       System.out.println(a+b);//30
       String s1=String.valueOf(a);
       System.out.println(s1+10);//1010

       char[] c=s.toCharArray();
       System.out.println(c);//This is demo
       for(int i=0;i<c.length;i++){
        System.out.print(c[i]+" ");//T h i s   i s   d e m o 
       }

       System.out.println();
    //    Reverse string
    for(int i=c.length-1;i>=0;i--){
        System.out.print(c[i]+" ");//o m e d   s i   s i h T
       }

       StringBuilder sb = new StringBuilder("Abhishek");
       System.out.println(sb);
   
    }
}
