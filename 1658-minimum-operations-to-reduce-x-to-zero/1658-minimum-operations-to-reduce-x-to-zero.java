class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0;

        for(int i : nums){
            total+=i;
        }

        int target = total - x;

        if(target < 0){
            return -1;
        }

        if(target==0){
            return nums.length;
        }

        int left = 0;
        int sum = 0;
        int maxLen = -1;

        for(int ri=0; ri<nums.length; ri++){
            sum+=nums[ri];

            while(sum>target && left<=ri){
                sum-=nums[left];
                left++;
            }

            if(sum==target){
                int len = ri-left+1;

                if(len>maxLen){
                    maxLen = len;
                }
            }
        }

        if(maxLen==-1){
            return -1;
        }else{
            return nums.length-maxLen;
        }
    }
}