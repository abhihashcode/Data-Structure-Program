package Array;

public class CommulativeSum {
    public static void main(String[] args) {
         int[] arr={1,2,3,4};
         int [] arrNew=new int[4];
         arrNew=getCumulativeSum(arr);
         for(int i=0;i<arrNew.length;i++){
			System.out.println(arrNew[i]);
		}

    }
public static int[] getCumulativeSum (int[] arr) {
		// add your logic here
		int arrNew[]=new int[arr.length];
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
            arrNew[i]=sum;
		}
		
        return arrNew;
	}
}
