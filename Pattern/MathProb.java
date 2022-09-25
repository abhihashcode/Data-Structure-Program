import java.util.Scanner;

import javax.xml.transform.Source;

public class MathProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        String str="779p091y";
        for(int i=0;i<str.length();i++){
           if(str.charAt(i)>=48 && str.charAt(i)<=57){
             sum=sum+Integer.valueOf(str.charAt(i));
           }
        }
      System.out.println(sum);
    }
}
