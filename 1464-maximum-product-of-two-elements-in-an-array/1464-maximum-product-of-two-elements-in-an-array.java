class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = 0;
        for(int i=0; i<nums.length; i++){
            int prod = 0;
            for(int j=i+1; j<nums.length; j++){
                prod = (nums[i]-1)*(nums[j]-1);
                maxProd = Math.max(prod, maxProd);
            }
        }
        return maxProd;
    }
}