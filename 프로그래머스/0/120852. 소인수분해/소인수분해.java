import java.lang.Math;
import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> answer = new HashSet<>();
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                answer.add(i);
                n /= i;
            }
        }
        
        if (n > 1) {
            answer.add(n);
        }
        
        int[] result = answer.stream().mapToInt(i -> i).toArray();
        Arrays.sort(result);
        
        return result;
    }
}