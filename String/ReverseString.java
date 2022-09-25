package String;
import java.util.*;;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String str=sc.nextLine();
        String rev="";
        
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);

        // char[] ch=str.toCharArray();
        // int i=0,j=ch.length-1;

        // while(i<j){
        //    char temp=ch[i];
        //    ch[i]=ch[j];
        //    ch[j]=temp;
        //    i++;
        //    j--;
        // }

        // System.out.println(ch);

        // for(int i=ch.length-1;i>=0;i--){
        //     System.out.print(ch[i]+" ");
        // }

        // for(int i=str.length()-1;i>=0;i--){
        //     System.out.print(str.charAt(i)+" ");
        // }


    }
}
