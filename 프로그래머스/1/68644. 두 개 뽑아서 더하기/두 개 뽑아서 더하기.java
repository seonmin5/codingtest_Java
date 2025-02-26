import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        int len = numbers.length;
        
        for (int i = 0; i < len-1; i++) {
            for (int j = i+1; j < len; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }
        
        int[] result = set.stream().mapToInt(i -> i).toArray();
        Arrays.sort(result);
        return result;
    }
}