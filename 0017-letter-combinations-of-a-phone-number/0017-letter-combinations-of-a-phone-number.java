class Solution {
    List<String> res = new ArrayList<>();
    String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public void backtrack(int ind, String digits, StringBuilder path){
        if(ind==digits.length()){
            res.add(path.toString());
            return;
        }

        String letters = map[digits.charAt(ind)-'0'];
        for(char c : letters.toCharArray()){
            path.append(c);
            backtrack(ind+1, digits, path);
            path.deleteCharAt(path.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return res;
        }

        backtrack(0, digits, new StringBuilder());
        return res;
    }
}