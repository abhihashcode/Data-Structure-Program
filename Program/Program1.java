import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Program1 {
    public static void main (String[] args) {
        // Your code here
Scanner sc = new Scanner(System.in);
int X = sc.nextInt();
int Y = sc.nextInt();

int A=X;
int B=Y;

int count = 0;

if(X!=Y){
X=X+1;
count++;
if(X!=Y){
  count--;
  Y=Y+1;
  count++;
  if(X!=Y){
      count--;
      Y=X;
      count++;
      if(X!=Y){
          count--;
          X=Y;
          count++;
      }
  }
}
}else{
count=0;
}
System.out.println(count);
}
}
