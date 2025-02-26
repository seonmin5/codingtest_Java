class Solution {
    public int solution(int[] wallet, int[] bill) {
        int count = 0;
        int wW = wallet[0], wH = wallet[1];
        int bW = bill[0], bH = bill[1];
        
        while (!((bW <= wW && bH <= wH) || (bH <= wW && bW <= wH))) {
            if (bW > bH) bW /= 2;
            else bH /= 2;
            count++;
        }
        
        return count;
    }
}