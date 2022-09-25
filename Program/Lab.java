import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	   int i,sum=0;
	   double mean , squareroot;
	   int a[]=new int[5];
	   try(Scanner sc = new Scanner(System.in)){
	   int n= sc.nextInt();
	   for(i=0;i<n;i++){
		   a[i]=sc.nextInt();
	   }

	   for(i=0;i<n;i++){
		   sum=sum+(a[i]*a[i]);
	   }
	   mean=(sum/n);
	   }
	   squareroot=squareRoot(mean);
       System.out.println("Result="+squareroot);
	}

	public static double squareRoot(double num){
        double t;
		double sqrtroot=num/2;
		do{
			t=sqrtroot;
			sqrtroot=(t+(num/t))/2;
		}while((t-sqrtroot)!=0);
		return Math.round(sqrtroot*Math.pow(10,6))/Math.pow(10,6);
	}
}