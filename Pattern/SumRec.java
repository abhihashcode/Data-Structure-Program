public class SumRec {
    public static void main(String[] args) {
        int n=5;
        System.out.println( printSum(n));
        }
    public static int printSum(int n){
        if(n==1)
          return 1;
        if(n<=0)
          return 0;
        return n+printSum(n-1);
    }
}
