import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        int[] lastIndex = new int[26];
        Arrays.fill(lastIndex, -1);
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int charIndex = c-'a';
            result[i] = (lastIndex[charIndex] == -1) ? -1 : i-lastIndex[charIndex];
            lastIndex[charIndex] = i;
        }
        
        return result;
    }
}