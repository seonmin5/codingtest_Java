class Solution {
    public int[] solution(int n, int m) {
        return new int[]{gcd(n, m), lcm(n, m)};
    }
    
    private int gcd(int n, int m) {
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }
    
    private int lcm(int n, int m) {
        return n*m / gcd(n, m);
    }
}