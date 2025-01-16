class Solution {
    public int solution(int num) {
        return collatzResult(num);
    }
    
    private static int collatzResult(int num) {
        int count = 0;
        while (count <= 500) {
            if (num == 1) {
                break;
            }
            count++;
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 2 == 1) {
                num = num*3 +1;
            }
        }
        
        if (count >= 500 && num != 1) {
            count = -1;
        }
        
        return count;
    }
}