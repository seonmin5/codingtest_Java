class Solution {
    public int[][] solution(int[] num_list, int n) {
        int repeat = num_list.length / n;
        int[][] answer = new int[repeat][n];
        int index = 0;
        
        for (int i = 0; i < repeat; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[index++];
            }
        }
        
        return answer;
    }
}