import java.lang.Math;

class Solution {
    public int solution(int[][] dots) {
        int x = dots[0][0];
        int y = dots[0][1];
        
        for (int i = 1; i < 4; i++) {
            if (dots[i][0] > x) {
                x = dots[i][0] - x;
                break;
            } else if (x > dots[i][0]) {
                x -= dots[i][0];
                break;
            }
        }
        
        for (int i = 1; i < 4; i++) {
            if (dots[i][1] > y) {
                y = dots[i][1] - y;
                break;
            } else if (y > dots[i][1]) {
                y -= dots[i][1];
                break;
            }
        }
        
        return Math.abs(x*y);
    }
}