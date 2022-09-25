package String;

public class MaxOccuring {
    public static void main(String[] args) {
        String str="abhissashdsks";
        int  s=0;
        int count=0;
        int max=0;
    
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                    if(max<count){
                        max=count;
                        count=-1;
                        s=i+1;                
                    }
                }
            }
        }

        System.out.print(str.charAt(s)+" Characte are maximu of "+ max);
    }
   
}
