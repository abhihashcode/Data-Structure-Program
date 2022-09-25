package Array;

public class ZeroFirst {
    public static void main(String[] args) {
        int arr[]={3,4,0,6,0,3,0};
        int count=0;
        int cur=arr.length-1;

        //First me zero

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0){
                arr[cur]=arr[i];
                cur--;
            }
        }
        if(cur>0){
            for(int i=cur;i>=0;i--){
                arr[i]=0;
            }
        }
System.out.println("First");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //Last me zero

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }

            for(int i=count;i<arr.length;i++){
                arr[i]=0;
            }
System.out.println("Last");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        
    }
}
