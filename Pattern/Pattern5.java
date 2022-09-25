//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      try (// Your code here
		Scanner sc = new Scanner(System.in)) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int n=sc.nextInt();

			int f1=(n*n*a),f2=(b*n)+c;
			System.out.println(f1+f2);
		}
	}
}