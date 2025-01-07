class Solution {
    public int solution(String[] strArr) {
        int max = 0;
        int maxLength = 0;
        
        for (String str : strArr) {
            maxLength = Math.max(maxLength, str.length());
        }
        
        int countArr[] = new int[maxLength+1];
        for (String str : strArr) {
            int count = str.length();
            countArr[count]++;
            max = Math.max(max, countArr[count]);
        }
        
        return max;
    }
}