public class Pattern{
    public static void main(String[] args) {
        int n=7;
        int i,j;

        // for(i=1;i<=n;i++){
        //     for(j=1;j<=n;j++){
        //        if(i==1 || j==1 || i==n || j==n || i==j || i+j==n+1){
        //         System.out.print(" * ");
        //        }else{
        //          System.out.print("   ");
        //        }
        //     }
        //     System.out.println();
        // }

        // for(i=1;i<=n;i++){
        //     for(j=1;j<=n;j++){
        //         if(j==1 || i==j || j==n){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(i=1;i<=n;i++){
        //     for(j=n;j>=1;j--){
        //         if(i>=j){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(j==1 || j==n || i==1 || i==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}