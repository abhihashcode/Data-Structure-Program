import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
			
			if(isPrime(n)){
				System.out.println(n);
				
			}
			else if(isPrime(n-1)){
                System.out.println(n-1);
				
			}
		    else if(isPrime(n+1)){
                System.out.println(n+1);
				
			}
		
	}

	static boolean isPrime(int n)
    {
   	 // Corner case
   	 if (n <= 1) return false;
    
   	 // Check from 2 to n-1
   	 for (int i = 2; i <=Math.sqrt(n); i++)
   		 if (n % i == 0)
   			 return false;
    
   	 return true;
    }

}

