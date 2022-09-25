import java.util.Scanner;

public class Donation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int prsn[] = new int[n];
            int sum=0;

            for(int i=0;i<n;i++){
                prsn[i]=sc.nextInt();
                sum+=prsn[i];
            }

            for(int i=0;i<n-1;i++){
                    if(prsn[i]==prsn[0])
                      System.out.print("0"+" ");
                    if(prsn[i]<=prsn[i+1]){
                        System.out.print("0"+" ");
                    }else if(prsn[i]>prsn[i+1]){
                        int t=prsn[i];
                        for(int k=i;k<n-1;k++){
                            if(t<prsn[k+1])
                            break;
                            else{ 
                                sum+=(t-prsn[k+1]);
                                System.out.print(t-prsn[k+1]+" ");
                            }
                        }
                    }
            }
        System.out.println();
        System.out.println(sum);
        }


    }
}
