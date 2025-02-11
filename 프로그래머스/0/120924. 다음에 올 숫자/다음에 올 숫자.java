class Solution {
    public int solution(int[] common) {
        int last = common.length - 1;
        if (common[1] - common[0] == common[2] - common[1]) {
            int diff = common[1] - common[0];
            return common[last] + diff;
        }
        int ratio = common[1] / common[0];
        return common[last] * ratio;
    }
}