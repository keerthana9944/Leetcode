class Solution {
    public int minimumSwaps(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int cnt = 0;

        while(left < right){
            while(left < right && nums[left] != 0){
                left++;
            }
            while(left < right && nums[right]==0){
                right--;
            }
            if(left < right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
                cnt++;
            }
        }
        return cnt;
    }
}