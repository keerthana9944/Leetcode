class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] nums = new int[n+m];
        int p = nums.length;

        int k = 0, i=0, j=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                nums[k++] = nums1[i++];
            }else{
                nums[k++] = nums2[j++];
            }
        }

        while(i<n){
            nums[k++] = nums1[i++];
        }
        while(j<m){
            nums[k++] = nums2[j++];
        }

        double median;

        if(p%2==1){
            return nums[p/2];
        }else{
            median = (nums[p/2-1] + nums[p/2])/2.0;
        }
        return median;
    }
}