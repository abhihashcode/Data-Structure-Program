package Array;

// import javax.swing.text.AbstractDocument.LeafElement;

public class ArrayDemoNew {
    public static void main(String[] args) {
        // int [][][] a;
        // // int[] [][]b;
        // // int [][]c[];
        // // int []d[][];
        // // int[] []e[];

        // a=new int[2][][];

        // a[0]=new int[2][];
        // a[0][0]=new int[3];
        // a[0][1]=new int[2];

        // a[1]=new int[2][];
        // a[1][0]=new int[2];
        // a[1][1]=new int[2];

        int[][][] a={{{10,20,30},{40,50,60,70},{80,90},{20,40}},{{10,20,30},{40,50,60,70},{80,90},{20,40}}};


        // System.out.println(a);
        // System.out.println(a[0]);
        // System.out.println(a[0][0]);
        // System.out.println(a[0][0][0]);


        // System.out.println(a.length);
        // System.out.println(a[0].length);
        // System.out.println(a[0][0].length);

        // // System.out.println(a[0][0][0].length);//error


        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    System.out.print(a[i][j][k]+" ");
                }
            System.out.println();
            }
        System.out.println();
        }

        // using for each loop 

        for(int i[][]:a){
            for(int j[]:i){
                for(int k:j){
                    System.out.print(k+" ");
                }
            System.out.println();
            }
        System.out.println();
        }

    }
}
