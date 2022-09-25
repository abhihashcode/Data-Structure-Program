package String;

public class CountString{

    public static void main(String[] args) {
       String str="abAbchdErh$38@35";
       int u=0,l=0,d=0,s=0;
       
       for(int i=0;i<str.length();i++){
        int val=str.charAt(i);
        System.out.print(val+" ");

        if(val>=65 && val<=90){
            u++;
        }else if(val>=97 && val<=122){
            l++;
        }else if(val>=48 && val<=97){
            d++;
        }else{
            s++;
        }
       }

       System.out.println("Uppercase="+u+"\nLowercase="+l+"\nDigit="+d+"\nSymbols="+s);
    }

}