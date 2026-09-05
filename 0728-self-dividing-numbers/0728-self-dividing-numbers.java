class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> result = new ArrayList<>();

        for (int num = left; num <= right; num++) {
            int original = num;
            boolean valid = true;

            while (num > 0) {
                int digit = num % 10;

                if (digit == 0 || original % digit != 0) {
                    valid = false;
                    break;
                }

                num /= 10;
            }

            if (valid) {
                result.add(original);
            }

            num = original;
        }

        return result;
    }
}