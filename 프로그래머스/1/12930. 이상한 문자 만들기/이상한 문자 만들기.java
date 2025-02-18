class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                result.append(" ");
                index = 0;
            } else {
                result.append((index++ % 2 == 0) ? Character.toUpperCase(c) : Character.toLowerCase(c));
            }
        }
        
        return result.toString();
    }
}