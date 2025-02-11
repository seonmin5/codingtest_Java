class Solution {
    public int solution(int[] sides) {
        int sum = sides[0] + sides[1];
        int diff = (sides[0] > sides[1]) ? (sides[0] - sides[1]) : (sides[1] - sides[0]);
        int count = 0;
        
        for (int i = diff+1; i < sum; i++) {
            count++;
        }
        
        return count;
    }
}