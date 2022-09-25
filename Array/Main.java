package Array;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	    Scanner sc = new Scanner(System.in);
		
		int t=sc.nextInt();
        int[] n=new int[t];

		for(int i=0;i<t;i++){
			n[i]=sc.nextInt();
		}
        int k=2;
		int count=0;

        for(int i=0;i<n.length;i++){
			for(int j=2;j<=n[i];j++){
				if(n[i]%j==0){
				if(j%2==0){
					count++;
				}
			 }
			}
		System.out.println(count);
		}
	}
}