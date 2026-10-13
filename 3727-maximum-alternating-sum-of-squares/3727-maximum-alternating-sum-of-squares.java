class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;

        long[] sqr = new long[n];

        for(int i=0; i<n; i++){
            sqr[i] = nums[i]*nums[i];
        }

        Arrays.sort(sqr);

        int mid = n/2;

        long ans = 0;
        
        for(int i=0; i<mid; i++){
            ans -= sqr[i];
        }

        for(int i=mid; i<n; i++){
            ans += sqr[i];
        }

        return ans;
    }
}