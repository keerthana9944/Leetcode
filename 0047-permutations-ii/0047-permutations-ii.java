class Solution {
    public void backtrack(int ind, int[] nums, List<List<Integer>> res){
        if(ind==nums.length){
            List<Integer> path = new ArrayList<>();
            for(int i : nums){
                path.add(i);
            }
            res.add(path);
            return;
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i=ind; i<nums.length; i++){
            if(set.contains(nums[i])){
                continue;
            }

            set.add(nums[i]);

            int temp = nums[ind];
            nums[ind] = nums[i];
            nums[i] = temp;

            backtrack(ind+1, nums, res);

            temp = nums[ind];
            nums[ind] = nums[i];
            nums[i] = temp;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res);
        return res;
    }
}