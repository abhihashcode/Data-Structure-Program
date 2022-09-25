package String;

public class WordCount {
    public static void main(String[] args) {
        String str="This Is My Pen";
        String rev="";
        String word[]=str.split(" ");

        for(int i=0;i<word.length;i++){
            String str1=word[i];

            for(int j=str1.length()-1;j>=0;j--){
                rev+=str1.charAt(j);
            }
            rev+=" ";
        }
        System.out.println(rev);
    }
}
