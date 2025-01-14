import java.util.Arrays;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int k) {
        return randomArray(arr, k);
    }
    
    private static int[] randomArray(int[] arr, int k) {
        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toCollection(LinkedHashSet::new));
        int[] answer = new int[k];
        
        int idx = 0;
        for (int num : set) {
            if (idx < k) {
                answer[idx++] = num;
            } else {
                break;
            }
        }
        
        while (idx < k) {
            answer[idx++] = -1;
        }
        
        return answer; 
    }
}