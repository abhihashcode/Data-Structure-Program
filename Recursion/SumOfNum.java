public class SumOfNum{
    public static void main(String[] args) {
        int n=5;
        sum(n,0);
    }

    // Function Recursion

    // public static int sum(int n){
    //     if(n<=0)
    //      return 0;
    //     return n+sum(n-1);
    // }

    // Parameterized Recursion
    public static void sum(int n,int sum){
       if(n<1)
         System.out.println(sum);
       else{
          sum(n-1,sum+n);
       }
    }
}