class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for (char c: my_string.toCharArray()) {
            if (c < 'a') {
                answer[c-'A']++;
            } else {
                answer[26+c-'a']++;
            }
        }
        
        return answer;
    }
}