class Solution {
    public int longestValidParentheses(String s) {
        int left = 0;
        int right = 0;
        int max = 0;

        for(char c : s.toCharArray()){
            if(c=='('){
                left++;
            }else{
                right++;
            }

            if(left==right){
                max = Math.max(max, 2*right);
            }else if(right > left){
                left = right = 0;
            }
        }

        left = right = 0;

        for(int i=s.length()-1; i>=0; i--){
            char c = s.charAt(i);

            if(c=='('){
                left++;
            }else{
                right++;
            }

            if(left==right){
                max = Math.max(max, 2*left);
            }else if(left>right){
                left = right = 0;
            }
        }
        return max;
    }
}