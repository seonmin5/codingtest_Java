class Solution {
    public int solution(int[] number) {
        int count = 0;
        int n = number.length;
        
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                int target = -(number[i] + number[j]);
                for (int k = j+1; k < n; k++) {
                    count += (number[k] == target) ? 1 : 0;
                }
            }
        }
        
        return count;
    }
}