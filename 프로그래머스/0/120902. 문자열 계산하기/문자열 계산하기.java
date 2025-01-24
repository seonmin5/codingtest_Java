class Solution {
    public int solution(String my_string) {
        String arr[] = my_string.split(" ");
        int answer = Integer.parseInt(arr[0]);
        
        for (int i = 1; i < arr.length; i+=2) {
            String operator = arr[i];
            int number = Integer.parseInt(arr[i+1]);
            
            if (operator.equals("+")) {
                answer += number;
            } else {
                answer -= number;
            }
        }
        
        return answer;
    }
}