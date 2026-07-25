class Solution {
    public int maxProduct(int n) {
        int lar = 0;
        int secLar = 0;
        while(n!=0){
            int digit = n%10;
            if(digit > lar){
                secLar = lar;
                lar = digit;
            }else if(digit > secLar){
                secLar = digit;
            }
            n/=10;
        }
        return lar*secLar;
    }
}