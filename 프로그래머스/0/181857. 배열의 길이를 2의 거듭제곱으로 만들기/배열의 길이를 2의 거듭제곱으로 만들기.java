class Solution {
    public int[] solution(int[] arr) {
        int newLength = 1;
        while (newLength < arr.length) {
            newLength *= 2;
        }
        
        int[] answer = new int[newLength];
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            answer[idx] = arr[i];
            idx++;
        }
        
        while (idx < newLength) {
            answer[idx] = 0;
            idx++;
        }
        return answer;
    }
}