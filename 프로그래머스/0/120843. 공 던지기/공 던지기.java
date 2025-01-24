class Solution {
    public int solution(int[] numbers, int k) {
        int count = 1;
        int idx = 0;
        int i = 0;
        
        while (count < k) {
            i += 2;
            idx = i % numbers.length;
            count++;
        }
        
        return numbers[idx];
    }
}