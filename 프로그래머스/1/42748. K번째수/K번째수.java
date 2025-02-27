import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int len = commands.length;
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            int[] c = commands[i];
            int[] sortArr = Arrays.copyOfRange(array, c[0]-1, c[1]);
            Arrays.sort(sortArr);
            answer[i] = sortArr[c[2]-1];
        }
        
        return answer;
    }
}