class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int num = i; num <= j; num++) {
            for (char c : String.valueOf(num).toCharArray()) {
                if (c == (char) (k+'0')) {
                    answer++;
                }
            }
        }
        return answer;
    }
}