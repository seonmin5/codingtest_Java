import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int max = 0;
        int count = 0;
        int answer = -1;
        
        for (int n : array) {
            freqMap.put(n, freqMap.getOrDefault(n, 0)+1);
            max = Math.max(max, freqMap.get(n));
        }
        
        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) == max) {
                count++;
                answer = key;
            }
        }
        
        return count > 1 ? -1 : answer;
        
    }
}