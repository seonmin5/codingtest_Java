import java.util.*;

class Solution{
    public int solution(int []A, int []B){
        Arrays.sort(A);
        Arrays.sort(B);
        // Integer[] BInteger = Arrays.stream(B).boxed().toArray(Integer[]::new);
        // Arrays.sort(BInteger, Collections.reverseOrder());
        int answer = 0;
        int n = B.length;
        for (int i = 0; i < A.length; i++) {
            answer += (A[i]*B[n-1-i]);
        }
        return answer;
    }
}