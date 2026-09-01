class Solution {
    public boolean isPalindrome(int x) {
        int dup = x;
        int rev = 0;

        while(dup > 0){
            int ld = dup % 10;
            rev = rev*10 + ld;
            dup /= 10;
        }

        if(rev == x){
            return true;
        }else{
            return false;
        }
    }
}