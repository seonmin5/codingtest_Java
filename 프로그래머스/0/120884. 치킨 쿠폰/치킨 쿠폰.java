class Solution {
    public int solution(int chicken) {
        int result = 0, service = 0;
        while (chicken >= 10) {
            service = chicken / 10;
            result += service;
            chicken = service + (chicken % 10);
        }
        return result;
    }
}