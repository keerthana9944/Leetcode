class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            min = Math.min(i, min);
            max = Math.max(i, max);
            set.add(i);
        }

        List<Integer> res = new ArrayList<>();
        for(int i=min; i<max; i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}