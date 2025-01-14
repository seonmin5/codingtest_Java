import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger n1 = new BigInteger(a);
        BigInteger n2 = new BigInteger(b);
        BigInteger sum = n1.add(n2);
        return String.valueOf(sum);
    }
}