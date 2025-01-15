import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        return queryArray(arr, query);
    }
    
    private static int[] queryArray(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            int index = query[i];
            if (i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, index+1);
            } else {
                arr = Arrays.copyOfRange(arr, index, arr.length);
            }
        }
        return arr;
    }
}