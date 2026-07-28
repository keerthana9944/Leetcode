class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int cnt = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
            if(cnt==1){
                res.add(nums[i]);
            }
        }

        int[] ans = new int[res.size()];
        for(int i=0; i<res.size(); i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}