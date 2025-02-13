class Solution {
    public String solution(String s) {
        // .split(" ")를 쓰면 안 되는 이유: 연속된 공백문자를 처리할 수 없기 때문
        StringBuilder result = new StringBuilder();
        boolean isFirst = false;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == ' ') {
                result.append(" ");
                isFirst = false;
            } else {
                if (!isFirst) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(Character.toLowerCase(c));
                }
                isFirst = true;
            }
        }
        
        return result.toString();
    }
}