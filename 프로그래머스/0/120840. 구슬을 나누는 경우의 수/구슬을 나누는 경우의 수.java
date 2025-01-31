class Solution {
    public int solution(int balls, int share) {
        if (balls == share) {
            return 1;
        }
        long result = 1;
        for (int i = 0; i < share; i++) {
            result *= (balls - i);
            result /= (i + 1);
        }
        return (int) result;
    }
}