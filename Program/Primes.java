import java.util.Scanner;

class Primes{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int f=0;
        int n= sc.nextInt();

        for(int i=2;i<n/2;i++){
            if(n%i==0){
                 f=1;
                break;
            }
        }
        if(f==1){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }
}