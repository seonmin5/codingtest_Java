import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        return arr2(arr);
    }
    
    private static int[] arr2(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int idx = 0;
        
        for (int num : arr) {
            if (num == 2) {
                list.add(idx);
            }
            idx++;
        }
        
        if (list.isEmpty()) {
            return new int[]{-1};
        } else if (list.size() == 1) {
            return new int[]{2};
        } 
        else {
            int start = list.get(0);
            int end = list.get(list.size()-1)+1;
            return Arrays.copyOfRange(arr, start, end);
        }
    }
}