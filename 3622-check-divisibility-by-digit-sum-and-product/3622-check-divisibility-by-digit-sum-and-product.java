class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int dup = n;
        while(dup != 0){
            int ld = dup % 10;
            sum += ld;
            prod *= ld;
            dup /= 10;
        }

        int total = sum + prod;

        if(n % total == 0){
            return true;
        }else{
            return false;
        }
        
    }
}