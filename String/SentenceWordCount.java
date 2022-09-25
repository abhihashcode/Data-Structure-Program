package String;

public class SentenceWordCount {
    public static void main(String[] args) {
        String str[]={"This is my pen","Who are You","You Know Me","See You Man In The Hotel Next","Get Out"};
        int count=0,max=0;
        String rev="";
        // for(int i=0;i<str.length;i++){
        //     String []word=str[i].split(" ");

        //     for(int j=0;j<word.length;j++){
        //         count++;
        //     }
        //     if(count>max){
        //         max=count;
        //     }
        //     count=0;
        // }
        // System.out.println(max);//Max Length Word in string

        for(int i=0;i<str.length;i++){
            String []word=str[i].split(" ");

            for(int j=0;j<word.length;j++){
                String s=word[j];
               
                for(int k=s.length()-1;k>=0;k--){
                    rev+=s.charAt(k);
                }
                rev+=" ";
            }
        }
        System.out.println(rev);
    }
}
