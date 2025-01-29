import java.util.*;

class Solution {
    public String solution(String s) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        StringBuilder answer = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) +1);
        }
        
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                answer.append(entry.getKey());
            }
        }
        
        if (answer.length() == 0) return "";
        
        char[] charArray = answer.toString().toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}