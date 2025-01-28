import java.util.*;

class Solution {
    public long solution(String numbers) {
        HashMap<String, Integer> map = new HashMap<>();
        String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < 10; i++) {
            map.put(arr[i], i);
        }
        
        int index = 0;
        StringBuilder result = new StringBuilder();
        while (index < numbers.length()) {
            for (String key : map.keySet()) {
                if (numbers.startsWith(key, index)) {
                    result.append(map.get(key));
                    index += key.length();
                    break;
                }
            }
        }
        
        long answer = Long.parseLong(result.toString());
        return answer;
    }
}