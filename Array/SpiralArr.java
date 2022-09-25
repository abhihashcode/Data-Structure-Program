package Array;

public class SpiralArr {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        for(int i=0;i<3;i++){
            if(i%2==0){
                for(int j=0;j<3;j++)
                  System.out.print(arr[i][j]+" ");
            }else{
                  for(int j=2;j>=0;j--)
                  System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
  //   int j=0;
  //   int i=0;

  //   while(i)
  //   for(i=0;i<3;i++){
  //         if(i==k){
  //           for(j=0;j<3;j++){
  //               System.out.print(arr[i][j]+" ");
  //           }
  //         }
  //         if(j==3){
  //           System.out.print(arr[i][j]+" ");
  //         }
  //       k++;
  //   }

  //   if(i==j){
  //       for(j=3;j>0;j--){
  //           System.out.print(arr[i][j]+" ");
  //       }
  //   }

  //   for(i=3;i>0;i--){
  //       System.out.print(arr[i][j]+" ");
  //   }
  // }

}
