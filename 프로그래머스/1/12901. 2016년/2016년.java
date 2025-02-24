class Solution {
    public String solution(int a, int b) {
        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE" ,"WED"};
        
        for (int i = 0; i < a; i++) {
            b += month[i];
        }
        
        return day[b%7];
    }
}