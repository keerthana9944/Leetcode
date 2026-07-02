class Solution {
    public void mergeArray(int n, int[] nums1, int m, int[] nums2, int[] nums){
        for(int i=0; i<n; i++){
            nums[i] = nums1[i];
        }
        for(int i=0; i<m; i++){
            nums[n+i] = nums2[i];
        }
        Arrays.sort(nums);
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] nums = new int[n+m];
        int k = nums.length;
        double median;
        mergeArray(n, nums1, m, nums2, nums);
        if(k%2==1){
            return nums[k/2];
        }else{
            median = (nums[k/2-1] + nums[k/2]) / 2.0;
        }
        return median;
    }
}