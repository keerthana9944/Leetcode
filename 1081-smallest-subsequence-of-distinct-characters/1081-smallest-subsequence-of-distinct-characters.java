class Solution {
    public String smallestSubsequence(String s) {
        int[] freq = new int[26];
        boolean[] visited = new boolean[26];

        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }

        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            freq[c-'a']--;

            if(visited[c-'a']) continue;

            while(!st.isEmpty() && st.peek() > c && freq[st.peek()-'a']>0){
                visited[st.peek()-'a'] = false;
                st.pop();
            }
            st.push(c);
            visited[c-'a'] = true;
        }

        StringBuilder str = new StringBuilder();
        for(char c : st){
            str.append(c);
        }

        return str.toString();
    }
}