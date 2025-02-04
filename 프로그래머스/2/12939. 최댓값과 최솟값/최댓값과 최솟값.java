import java.lang.Math;

class Solution {
    public String solution(String s) {
        String arr[] = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        
        return min + " " + max;
    }
}