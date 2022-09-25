package Array;

public class ArrayMerge{
    public static void main(String[] args) {
        int nums1[]={1,3};
        int nums2[]={2};

        System.out.println(findMedianSortedArrays(nums1,nums2));
        
    }
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int l1=nums1.length;
            int l2=nums2.length;
            int flen=l1+l2;
            int arr[]=new int[flen];
            int k=0;
            int l=0;
            int i=0;
            double ot;
            
            while(k<l1 && l<l2){
              if(nums1[k]<nums2[l]){
                  arr[i++]=nums1[k++];
              }else{
                  arr[i++]=nums2[l++];
              }    
            }
            
            while(k<l1){
                arr[i++]=nums1[k++];
            }
            
            while(l<l2){
                arr[i++]=nums2[l++];
               }

            for(int j=0;j<flen;j++){
                System.out.println(arr[j]);
            }
            
            if(flen%2==0){
              int mid=flen/2;
              int val=arr[mid-1]+arr[mid];
              System.out.println(val);
              ot=val/2.000;
              System.out.println(ot);
              return ot;
            }else{
                int mid=flen/2;
                return Double.valueOf(arr[mid]);
            }
        }
}