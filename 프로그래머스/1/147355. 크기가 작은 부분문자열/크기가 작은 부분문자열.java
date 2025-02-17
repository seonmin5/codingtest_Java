class Solution {
    public int solution(String t, String p) {
        int count = 0;
        int pLen = p.length();
        int tLen = t.length();
        long pValue = Long.parseLong(p);
        
        for (int i = 0; i <= tLen - pLen; i++) {
            long subValue = Long.parseLong(t.substring(i, i+pLen));
            count += (subValue <= pValue) ? 1 : 0;
        }
        
        return count;
    }
}