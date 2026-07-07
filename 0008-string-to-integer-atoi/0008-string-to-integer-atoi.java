class Solution {
    public int myAtoi(String s) {
        int res = 0;
        int i = 0;
        int n = s.length();
        int sign = 1;

        while(i<n && s.charAt(i)==' '){
            i++;
        }

        if(i==n){
            return 0;
        }

        if(s.charAt(i)=='-'){
            sign = -1;
            i++;
        }else if(s.charAt(i)=='+'){
            i++;
        }

        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';

            if(res > Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10 && digit > 7)){
                if(sign==1){
                    return Integer.MAX_VALUE;
                }else{
                    return Integer.MIN_VALUE;
                }
            }

            res = res*10+digit;
            i++;
        }

        return res*sign;
    }
}