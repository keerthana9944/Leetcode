class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }

        StringBuilder firstHalf = new StringBuilder();
        String middle = "";

        for(int i=0; i<26; i++){
            if(freq[i]%2==1){
                middle = String.valueOf((char)(i+'a'));
            }

            for(int j=0; j<freq[i]/2; j++){
                firstHalf.append((char)(i+'a'));
            }
        }

        StringBuilder secHalf = new StringBuilder(firstHalf).reverse();
        return firstHalf.toString() + middle + secHalf.toString();
    }
}