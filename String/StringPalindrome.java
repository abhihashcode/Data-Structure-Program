package String;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String str=sc.nextLine();
        String rev="";
        
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }


        // String str="mradarm";
        // int i=0,j=str.length()-1;
        // int f=0;

        // while(i<j){
        //     if(str.charAt(i)==str.charAt(j)){
        //         i++;
        //         j--;
        //         f=1;
        //     }
        //     if(str.charAt(i)!=str.charAt(j)){
        //         f=0;
        //         break;
        //     }    
            
        // }

        // if(f==0){
        //     System.out.println("Not Palindrome");
        //  }else{
        //     System.out.println("String is palindrome");
        //  }
    }
}
