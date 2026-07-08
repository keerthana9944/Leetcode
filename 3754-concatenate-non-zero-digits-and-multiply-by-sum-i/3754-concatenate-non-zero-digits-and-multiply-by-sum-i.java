class Solution {
    public long sumAndMultiply(int n) {
        int x = 0;
        long sum = 0;
        int dup = n;
        int revNum = 0;
        while(n>0){
            int ld = n%10;
            sum += ld;
            n/=10;
        }

        while(dup>0){
            int ld = dup%10;
            if(ld!=0){
                revNum = revNum*10+ld;
            }
            dup/=10;
        }
        
        while(revNum>0){
            x = x*10 + revNum%10;
            revNum /= 10;
        }

        return x*sum;
        
    }
}