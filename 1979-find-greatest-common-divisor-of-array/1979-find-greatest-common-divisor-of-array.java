class Solution {
    private int gcd(int a, int b){
        while(b!=0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for(int i=0; i<nums.length; i++){
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
        }
        return gcd(min, max);
    }
}