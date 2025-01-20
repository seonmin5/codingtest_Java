class Solution {
    public int solution(String my_string) {
        String[] split = my_string.split("[a-zA-Z]");
        int answer = 0;
        
        for (String s : split) {
            if (!s.isEmpty()) {
                answer += Integer.parseInt(s);
            }
        }
        
        return answer;
    }
}