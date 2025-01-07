class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("[abc]");
        
        if (answer.length == 0) {
            return new String[]{"EMPTY"};
        }
        
        return java.util.Arrays.stream(answer)
                               .filter(s -> !s.isEmpty())
                               .toArray(String[]::new);
    }
}