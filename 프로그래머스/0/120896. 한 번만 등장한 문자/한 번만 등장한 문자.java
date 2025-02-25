class Solution {
    public String solution(String s) {
        int arr[] = new int[26];
        for (char c : s.toCharArray()) {
            arr[c-'a']++;
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 1) {
                char c = (char) (i+'a');
                result.append(c);
            }
        }
        return result.toString();
    }
}