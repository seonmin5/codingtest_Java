class Solution {
    public int solution(String[] babbling) {
        return (int) java.util.Arrays.stream(babbling)
            .filter(b -> b.matches("^(aya|ye|woo|ma)+"))
            .count();
    }
}