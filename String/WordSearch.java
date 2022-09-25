package String;

public class WordSearch {
    public static void main(String[] args) {
        String s="This is my pen";
        String fnd="pn";
        String word[]=s.split(" ");

        for(int i=0;i<word.length;i++){
            if(fnd.equals(word[i])){
                System.out.println("true");
            }
        }
        System.out.println("false");
    }
}
