class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        int longSeq = 0;

        for(int i : set){
            if(!set.contains(i-1)){
                int currNum = i;
                int cnt = 1;

                while(set.contains(currNum+1)){
                    currNum++;
                    cnt++;
                }

                longSeq = Math.max(longSeq, cnt);
            }
        }
        return longSeq;
    }
}