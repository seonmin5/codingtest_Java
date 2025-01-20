class Solution {
    public int solution(int[] array, int n) {
        int valueDiffs[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            valueDiffs[i] = Math.abs(n - array[i]);
        }
        
        int minDiff = valueDiffs[0];
        int answer = array[0];
        for (int i = 0; i < array.length; i++) {
            if (valueDiffs[i] < minDiff) {
                minDiff = valueDiffs[i];
                answer = array[i];
            } else if (valueDiffs[i] == minDiff) {
                answer = Math.min(answer, array[i]);
            }
        }
        
        return answer;
    }
}