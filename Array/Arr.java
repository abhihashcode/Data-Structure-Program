package Array;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.util.Arrays;

public class Arr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
			   int n = sc.nextInt();
			   int [] arr = new int [n];

			   for(int i = 0; i<n; i++){
				   arr[i] = sc.nextInt();
			   }
		     int count=0;
			 int mx=0;
			 int num=0;
             Arrays.sort(arr);
			   for(int i=0;i<n;i++){
				   for(int j=0;j<n;j++){
					   if(arr[i]==arr[j]){
						   count++;
					   }
				   }

				if(mx<=count){
					mx=Math.max(count,mx);
                      num=arr[i];
				}

			   }
		System.out.println(num);
    }
}