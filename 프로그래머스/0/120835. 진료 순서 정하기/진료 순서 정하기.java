import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sorted = emergency.clone();
        Arrays.sort(sorted);
        
        for (int i = 0; i < emergency.length; i++) {
            int rank = emergency.length - Arrays.binarySearch(sorted, emergency[i]);
            answer[i] = rank;
        }
        
        return answer;
    }
}