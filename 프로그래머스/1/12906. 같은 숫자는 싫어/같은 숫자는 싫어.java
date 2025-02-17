import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = new int[arr.length];
        int index = 0;
        answer[index++] = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] != arr[i]) {
                answer[index++] = arr[i];
            }
        }
        
        return Arrays.copyOf(answer, index);
    }
}