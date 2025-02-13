class Solution {
    public String[] solution(String[] quiz) {
        String[] result = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] parts = quiz[i].split(" = ");
            String[] expression = parts[0].split(" ");
            
            int num1 = Integer.parseInt(expression[0]);
            String sign = expression[1];
            int num2 = Integer.parseInt(expression[2]);
            int expectValue = sign.equals("+") ? num1+num2 : num1-num2;
    
            result[i] = expectValue == Integer.parseInt(parts[1]) ? "O" : "X";
        }
        return result;
    }
}