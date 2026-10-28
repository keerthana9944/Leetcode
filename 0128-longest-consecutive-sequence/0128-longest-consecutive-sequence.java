class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int longest = 0;

        for(int i : nums){
            if(!map.containsKey(i)){
                int left = map.getOrDefault(i-1, 0);
                int right = map.getOrDefault(i+1, 0);

                int length = left+right+1;

                map.put(i, length);
                map.put(i-left, length);
                map.put(i+right, length);

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}