class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        while (n >= 3) {
            sb.append(n%3);
            n /= 3;
        }
        sb.append(n);
        return Integer.parseInt(sb.toString(), 3);   
    }
}