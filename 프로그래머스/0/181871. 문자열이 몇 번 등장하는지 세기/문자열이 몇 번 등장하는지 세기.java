class Solution {
    public int solution(String myString, String pat) {
        return countResult(myString, pat);
    }
    
    private int countResult(String string1, String string2) {
        int n1 = string1.length();
        int n2 = string2.length();
        int count = 0;
        
        for (int i = 0; i <= n1-n2; i++) {
            if (string1.substring(i, i+n2).equals(string2)) {
                count++;
            }
        }
        
        return count;
    }
}