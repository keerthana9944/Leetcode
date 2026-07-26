class Solution {
    public long maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        long maxProd1 = 1L * nums[0] * nums[1] * 100000;
        long maxProd2 = 1L * nums[n - 2] * nums[n - 1] * 100000;
        long maxProd3 = 1L * nums[0] * nums[n - 1] * (-100000);

        return Math.max(maxProd1, Math.max(maxProd2, maxProd3));
    }
}