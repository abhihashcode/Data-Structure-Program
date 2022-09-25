package Array;

import java.util.Scanner;

public class setMatrixZeros {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

           for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    for(int k=0;k<n;k++){
                        for(int l=0;l<m;l++){
                            arr[k][j]=-1;
                            arr[i][l]=-1;
                        }
                    }
                }
            }
        }

        System.out.println("\nOutput");
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
