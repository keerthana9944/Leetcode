class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }

        for(int i=min; i<max; i++){
            boolean found = false;
            for(int j : nums){
                if(j==i){
                    found = true;
                    break;
                }
            }
            if(!found){
                res.add(i);
            }
        }
        return res;
    }
}