class Solution {
    public long sumAndMultiply(int n) {

        if(n==0){
            return 0;
        }

        int sum = 0;
        int dup = n;
        String s = String.valueOf(n);

        StringBuilder x = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c != '0'){
                x.append(c);
            }
        }
        while(dup>0){
            int ld = dup%10;
            sum += ld;
            dup /= 10;
        }

        long num = Long.parseLong(x.toString());
        return num*sum;

    }
}