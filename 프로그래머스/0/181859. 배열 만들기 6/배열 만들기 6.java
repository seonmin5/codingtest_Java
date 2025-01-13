import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        return stkArray(arr);
    }
    
    private static int[] stkArray(int[] arr) {
        int i = 0;
        List<Integer> stk = new ArrayList<>();
        
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size()-1) == arr[i]) {
                stk.remove(stk.size()-1);
                i++;
            } else {
                stk.add(arr[i]);
                i++;
            }
        }
        
        if (stk.isEmpty()) {
            return new int[]{-1};
        } else {
            int[] result = new int[stk.size()];
            for (int j = 0; j < stk.size(); j++) {
                result[j] = stk.get(j);
            }
            return result;
        }
    }
}