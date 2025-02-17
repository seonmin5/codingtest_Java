class Solution {
    public int solution(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            result += countDivisor(i);
        }
        return result;
    }
    
    private int countDivisor(int n) {
        int count = 0;
        if (n == 1) {
            return -1;
        } else {
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            return (count % 2 == 0) ? n : -n;
        }
    }
}