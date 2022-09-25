package Array;

public class AntiClockArray {
    public static void main(String[] args) {
        int k=2;
        int l=0;
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int newArr[][]=new int[3][3];

        //Storin first and then printing
        
        // for(int i=0;i<3;i++){
        //     // int val=i;
        //     for(int j=0;j<3;j++){
        //         // newArr[i][j]=arr[l++][k];
        //         int temp=arr[i][j];
        //         arr[i][j]=arr[j][i];
        //         arr[j][i]=temp;
        //     }
        //     k--;
        //     l=0;
        // }

        //Only Printing
        for(int i = 2; i>=0; i--){
            for(int j = 0; j<3;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
           
    
     

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
}
