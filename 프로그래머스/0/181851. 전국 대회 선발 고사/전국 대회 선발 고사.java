import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        return attendableRank(rank, attendance);
    }
    
    private static int attendableRank(int[] rank, boolean[] attendance) {
        List<int[]> availableStudents = new ArrayList<>();
        
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                availableStudents.add(new int[]{i, rank[i]});
            }
        }
        
        availableStudents.sort((a, b) -> Integer.compare(a[1], b[1]));
        int a = availableStudents.get(0)[0];
        int b = availableStudents.get(1)[0];
        int c = availableStudents.get(2)[0];
        
        return 10000 * a + 100 * b + c;
    }
}