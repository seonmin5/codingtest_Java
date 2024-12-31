class Solution {
    public int solution(String myString, String pat) {
        StringBuilder newString = new StringBuilder();
        for (char c: myString.toCharArray()) {
            if (c == 'A') {
                newString.append('B');
            } else {
                newString.append('A');
            }
        }
        return newString.toString().contains(pat) ? 1 : 0;
    }
}