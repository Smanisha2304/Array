import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n = nums1.length + nums2.length;
        int [] a = new int [n];
        System.arraycopy(nums1,0,a,0,nums1.length);
        System.arraycopy(nums2,0,a,nums1.length,nums2.length);
        Arrays.sort(a);
        double c;
        if(a.length%2==0)
        {
            int a1 =a[a.length/2];
           
            int b = a[(a.length-1)/2];
            c= (a1+b)/2.0;
            return c;
        }
        
        return a[a.length/2];
    }

}
