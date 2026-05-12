class Solution {
    public void backtrack(int ind, int[] candidates, int target, int sum, List<Integer> path, List<List<Integer>> res){
        if(sum==target){
            res.add(new ArrayList<>(path));
            return;
        }

        if(sum>target) return;

        for(int i=ind; i<candidates.length; i++){
            path.add(candidates[i]);
            backtrack(i, candidates, target, sum+candidates[i], path, res);
            path.remove(path.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, candidates, target, 0, new ArrayList<>(), res);
        return res;
    }
}