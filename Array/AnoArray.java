package Array;

public class AnoArray {
    public static void main(String[] args) {
        sum(new int[]{2,3,4,5});
    }
    static void sum(int[] n){
        int total=0;
        for(int i:n){
            total+=i;
        }
        System.out.println(total);
    }
}
