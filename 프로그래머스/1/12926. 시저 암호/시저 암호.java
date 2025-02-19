class Solution {
    public String solution(String s, int n) {
        StringBuilder result = new StringBuilder(s.length());
        for (char c: s.toCharArray()) {
            if (c == ' ') result.append(c);
            else {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char)((c-base+n)%26+base));
            }
        }
        return result.toString();
    }
}