import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int sum = 0;
        int result = 0;
        Arrays.sort(d);
        
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if (budget >= sum) {
                result = i+1;
            } else {
                return result;
            }
        }
        
        return result;
    }
}